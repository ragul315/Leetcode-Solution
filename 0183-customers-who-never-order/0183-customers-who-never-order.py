import pandas as pd

def find_customers(customers: pd.DataFrame, orders: pd.DataFrame) -> pd.DataFrame:
    names = customers[~customers['id'].isin(orders['customerId'])]['name']
    return pd.DataFrame({'Customers': names})
    
    