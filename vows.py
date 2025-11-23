f = [line.rstrip("\n") for line in open("Input/vows.dat").readlines()][:-1] # ah python

for line in f[:-1]:
    print(line.replace("BLANK", f[-1]))