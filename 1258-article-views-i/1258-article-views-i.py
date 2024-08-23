import pandas as pd

def article_views(views: pd.DataFrame) -> pd.DataFrame:
    df=views[(views['author_id']==views['viewer_id'])]['author_id'].unique()
    df=pd.DataFrame({'id':sorted(df)})
    return pd.DataFrame(df)