def trueError(trueValue,Approximation):
    maxvalue=max(trueValue,Approximation)
    minvalue=min(trueValue,Approximation)
    return maxvalue-minvalue
def trueRelativeError(trueValue,Approximation):
    maxvalue=max(trueValue,Approximation)
    return (trueError(trueValue,Approximation)/maxvalue)
def truePercentRelativeError(trueValue,Approximation):
    maxvalue=max(trueValue,Approximation)
    minvalue=min(trueValue,Approximation)
    return ((maxvalue-minvalue)/maxvalue)*100
def approximateError(currentApproximation,previousApproximation):
    maxvalue=max(currentApproximation,previousApproximation)
    minvalue=min(currentApproximation,previousApproximation)
    return maxvalue-minvalue
def approximateRelativeError(currentApproximation,previousApproximation):
    maxvalue=max(currentApproximation,previousApproximation)
    return (approximateError(currentApproximation,previousApproximation)/maxvalue)
def approximatePercentRelativeError(currentApproximation,previousApproximation):
    maxvalue=max(currentApproximation,previousApproximation)
    minvalue=min(currentApproximation,previousApproximation)
    return ((maxvalue-minvalue)/maxvalue)*100


"""
print("True Error is :",trueError(5,1))
print("True Relative Error is :",trueRelativeError(5,1))
print("True Percent Relative Error is :",truePercentRelativeError(5,1),"%")
print("ApproximateError is :",approximateError(5,1))
print("Approximate Relative Error is :",approximateRelativeError(5,1))
print("Approximate Percent Relative Error is :",approximatePercentRelativeError(5,1),"%")
"""