package Trees;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TreePrinter {

    public static void printPyramid(TreeNode root) {
        if (root == null) {
            return;
        }

        // Each node gets a cell one character wider than the widest value,
        // so values never touch and the extra room keeps them centred.
        int cellWidth = maxValueWidth(root) + 1;
        int span = 2 * cellWidth; // layout is done in half-character units

        Map<TreeNode, Integer> widths = new HashMap<>();
        int totalWidth = computeWidth(root, span, widths);

        Map<TreeNode, Integer> centres = new HashMap<>();
        assignCentres(root, 0, widths, centres);

        List<List<TreeNode>> levels = new ArrayList<>();
        collectLevels(root, 0, levels);

        StringBuilder output = new StringBuilder();
        for (List<TreeNode> level : levels) {
            char[] line = new char[totalWidth / 2 + 1];
            Arrays.fill(line, ' ');
            int end = 0;

            for (TreeNode node : level) {
                String value = String.valueOf(node.data);
                int start = (centres.get(node) - value.length()) / 2;
                value.getChars(0, value.length(), line, start);
                end = Math.max(end, start + value.length());
            }

            output.append(line, 0, end).append('\n');
        }

        System.out.print(output);
    }

    // Width of a subtree in half-character units.
    private static int computeWidth(TreeNode node, int span, Map<TreeNode, Integer> widths) {
        if (node == null) {
            return 0;
        }

        int width;
        if (node.left == null && node.right == null) {
            width = span;
        } else if (node.left == null) {
            width = computeWidth(node.right, span, widths);
        } else if (node.right == null) {
            width = computeWidth(node.left, span, widths);
        } else {
            width = computeWidth(node.left, span, widths) + computeWidth(node.right, span, widths);
        }

        widths.put(node, width);
        return width;
    }

    // Place every parent exactly at the midpoint of its children.
    private static void assignCentres(TreeNode node, int left, Map<TreeNode, Integer> widths,
            Map<TreeNode, Integer> centres) {
        if (node == null) {
            return;
        }

        if (node.left == null && node.right == null) {
            centres.put(node, left + widths.get(node) / 2);
        } else if (node.left == null) {
            assignCentres(node.right, left, widths, centres);
            centres.put(node, centres.get(node.right));
        } else if (node.right == null) {
            assignCentres(node.left, left, widths, centres);
            centres.put(node, centres.get(node.left));
        } else {
            assignCentres(node.left, left, widths, centres);
            assignCentres(node.right, left + widths.get(node.left), widths, centres);
            centres.put(node, (centres.get(node.left) + centres.get(node.right)) / 2);
        }
    }

    private static void collectLevels(TreeNode node, int depth, List<List<TreeNode>> levels) {
        if (node == null) {
            return;
        }
        if (depth == levels.size()) {
            levels.add(new ArrayList<>());
        }
        levels.get(depth).add(node);
        collectLevels(node.left, depth + 1, levels);
        collectLevels(node.right, depth + 1, levels);
    }

    private static int maxValueWidth(TreeNode node) {
        if (node == null) {
            return 0;
        }
        return Math.max(String.valueOf(node.data).length(),
                Math.max(maxValueWidth(node.left), maxValueWidth(node.right)));
    }
}
