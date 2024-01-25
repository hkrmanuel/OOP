user = int(input("Enter Gross Monthly Salary:"))
income_tax = 0
net_salary = 0
rates=[0/100, 5/100,10/100,17.5/100,25/100,30/100,35/100]

def income_tax_calculator(usrinput):
    count = 0
    tax_income = 0
    if usrinput >=  402 :
        count +=1
        income_tax = 0
        tax_income = usrinput - 402
        
    if tax_income >= 110:
        count +=1
        income_tax += 5.5
        tax_income = tax_income - 110

    if tax_income >= 130:
        count +=1
        income_tax +=13
        tax_income = tax_income-130

    if tax_income >= 3000:
        count +=1
        income_tax +=525
        tax_income = tax_income-3000

    if tax_income >= 16395:
        count +=1
        income_tax +=4098.75
        tax_income = tax_income-16395

    if tax_income >= 29963:
        count +=1
        income_tax +=8988.90
        tax_income = tax_income-29963

    if tax_income >= 50000:
        count +=1
        income_tax +=17500
        tax_income = tax_income-50000

    if count !=7:
        income_tax += tax_income*rates[count]
        net_salary = usrinput - income_tax

        
    return net_salary, tax_income

print("Your Income Tax is", income_tax_calculator(user))