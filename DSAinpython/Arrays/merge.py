def merge(intervals: list[list[int]]) -> list[list[int]]:
    # 1. Line them up by start time (x[0] means the first number in each pair)
    intervals.sort(key=lambda x: x[0])

    # 2. Put the first interval on our final board
    merged = [intervals[0]]

    # 3. Loop through all the remaining intervals
    for current in intervals[1:]:
        last_end = merged[-1][1]  # End time of the last block on our board

        if current[0] <= last_end:
            # Clash! Stretch the end time to whichever finishes later
            merged[-1][1] = max(last_end, current[1])
        else:
            # No clash! Place it as a separate block on the board
            merged.append(current)

    return merged

meeting_intervals = [[1,2],[4,5],[3,5]] 
print(merge(meeting_intervals))
 
 
 
