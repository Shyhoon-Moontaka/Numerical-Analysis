import math

def f(x):
    return x**4 - x - 10

def secant(x1, x2, E):
    x0 = 0
    prev_c = 0
    error = float('inf')
    iterator = 1

    if f(x1) * f(x2) < 0:
        print("I\tx1\t\tx2\t\tx0\t\terror")
        
        while error >= E:
            x0 = (x1 * f(x2) - x2 * f(x1)) / (f(x2) - f(x1))

            error = abs((x0 - prev_c) / x0) * 100 if x0 != 0 else 0
            print(f"{iterator}\t{x1:.4f}\t\t{x2:.4f}\t\t{x0:.4f}\t\t{error:.4f}")
            x1 = x2
            x2 = x0
            prev_c = x0
            iterator += 1
            if f(x0) == 0:
                break

        print(f"Root of the given equation = {x0}")
    else:
        print("Cannot find a root in the given interval")

if __name__ == "__main__":
    x1 = 1
    x2 = 2
    E = 0.0001
    secant(x1, x2, E)
