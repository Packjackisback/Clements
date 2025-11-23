with open("Input/rsvps.dat") as f:
    letters = next(f)

    num_accepted = 0
    num_rejected = 0
    for line in f:
        split_line = line.split()
        match (split_line[2]):
            case ("Yes"):
                num_accepted += int(split_line[1])
            case (_):
                num_rejected += int(split_line[1])

    print(f"{num_accepted} {num_rejected} {(num_accepted*100/(num_accepted+num_rejected)):.2f}%")
        