import error
prevError=error.trueError(3,1)
def fun(x):
    return x*x*x - x*x + 5

def bisection(a, b):
    if fun(a) * fun(b) >= 0:
        print("Root doesn't exist in this interval.")
        return

    prev_c = 0
    iterator = 1

    print("I\t a\t b\t c\t error")
    
    while True:
        c = (a + b) / 2
        error = abs((c - prev_c) / c) * 100
        print(f"{iterator}\t {a:.2f}\t {b:.2f}\t {c:.2f}\t {error:.2f}")

        if fun(c) == 0.0:
            break
        elif fun(c) * fun(a) > 0:
            a = c
        else:
            b = c

        prev_c = c
        iterator += 1

        if error <prevError:
            break

    print("The value of root is:", c)


bisection(-5,3)
