with open("Input/vendors.dat") as f:
    n = int(next(f))
    for i in range(n):
        item, vendors_num, date, budget = next(f).split()
        vendors_num = int(vendors_num)
        budget = float(budget)

        potential_candidates = []

        for i in range(vendors_num):
            name, cost, rating, *dates = next(f).split()
            cost = float(cost)
            rating = float(rating)

            if(date not in dates and cost <= budget):
                potential_candidates.append((name, cost, rating))

        potential_candidates.sort(key=lambda c: (-c[2], c[1], c[0]))

        index = 1
        print(f"{item}:")
        for candidate in potential_candidates:
            print(f"{index}: {candidate[0]} {candidate[1]:.2f} {candidate[2]:.1f}")
            index+=1