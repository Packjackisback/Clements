with open("Input/venue.dat") as f:
    m, h = map(int, next(f).split())
    for line in f:
        name, p, l, w = line.split()
        p = float(p)
        l, w = map(int, [l, w])

        print(f"{name} {(p/(l * w * h)):.6f}")