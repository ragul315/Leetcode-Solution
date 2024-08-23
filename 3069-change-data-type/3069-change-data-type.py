import pandas as pd

def changeDatatype(students: pd.DataFrame) -> pd.DataFrame:
    s=students.astype({'grade':int})
    return s
    