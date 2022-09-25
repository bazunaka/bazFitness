import requests
from bs4 import BeautifulSoup

url = 'http://sportwiki.to/Категория:Тренинг'
response = requests.get(url)

soup = BeautifulSoup(response.text, 'lxml')

print(soup)