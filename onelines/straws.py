(lambda lines: 
    (lambda values: 
        (lambda straw_sizes: 
            (lambda opts: (
                [opts.__setitem__(i, max(values[cut-1]+opts[i-cut] for cut in range(1, min(len(values), i)+1))) 
                 for i in range(1, len(opts))],
                [print(opts[size]) for size in straw_sizes]
            ))([0]*(max(straw_sizes)+1))
        )([int(x) for x in lines[2:]])
    )(list(map(int, lines[1].split())))
)(open("Input/straws.dat").readlines())