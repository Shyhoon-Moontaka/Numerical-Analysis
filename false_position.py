def fun(x):
    return x ** 3 - x ** 2 + 2

def regulafalsemethod(a, b):
    if fun(a) * fun(b) >= 0:
        print("Root doesn't exist in this interval.")
        return

    c, prev_c = 0, 0
    error = 0
    iterator = 1

    print(f"I\ta\tb\tc\terror")

    while True:
        c = (a * fun(b) - b * fun(a)) / (fun(b) - fun(a))
        error = abs((c - prev_c) / c) * 100
        print(f"{iterator}\t{a:.2f}\t{b:.2f}\t{c:.2f}\t{error:.2f}")

        if fun(c) == 0:
            break
        elif fun(c) * fun(a) > 0:
            a = c
        else:
            b = c

        prev_c = c
        iterator += 1

        if error < 0.01:
            break

    print(f"The value of root is: {c:.2f}")



a, b = -5,12
regulafalsemethod(a, b)

