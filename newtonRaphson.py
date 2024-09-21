import error
prevError=error.trueError(3,1)
def f(x):
    
    return x ** 3 - x ** 2 + 5

def derivative_f(x):
    return 3 * x ** 2 - 2 * x

def newton_raphson_method(a):
    
    x0 = a
    iterator = 1
    
    print("I\tx0\tx1\terror")

    while True:
        
        x1 = x0 - f(x0) / derivative_f(x0)
        
        error = abs((x1 - x0) / x1) * 100
        
        print(f"{iterator}\t {x0:.2f}\t {x1:.2f}\t {error:.2f}%")
        
        
        if error < prevError:
            break
        
       
        x0 = x1
        iterator += 1
    
    print(f"The value of root is: {x1:.6f}")

a = 5
newton_raphson_method(a)
