with open("Input/straws.dat") as f:
    n, r = map(int, next(f).split())
    values = list(map(int, next(f).split()))
    straw_sizes = [int(line.strip()) for line in f]
straw_size = max(straw_sizes)

opts = [0] * (straw_size + 1)

for i in range(1, straw_size + 1):
    best = 0
    for cut in range(1, min(len(values), i) + 1):
        best = max(best, values[cut - 1] + opts[i - cut])
    opts[i] = best

for size in straw_sizes:
    print(opts[size])