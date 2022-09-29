import requests
import pandas as pd
from bs4 import BeautifulSoup

url = 'http://sportwiki.to/Грудные_мышцы_-_упражнения_и_особенности_тренировки'
response = requests.get(url)

soup = BeautifulSoup(response.text, 'html.parser')
quotes = soup.find_all('li')
result_list = {'name': [], 'fk': []}

for quote in quotes:
    result_list['name'].append(quote.text)
    result_list['fk'].append('3')

df = pd.DataFrame(result_list)
df.to_csv("Data/pectoral.csv")

'''file = open("Data/shoulders.txt", "w")
for quote in quotes:
    file.write(quote.text)
file.close()'''

'''internalLinks = [
    a.get('href') for a in soup.find_all('a', class_='mainpage-content')
    if a.get('href') and a.get('href').startswith('/')]

file = open("Data/urls.txt", "w")
for links in internalLinks:
    file.write("http://sportwiki.to" + links)'''
