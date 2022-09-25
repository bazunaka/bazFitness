import requests
from bs4 import BeautifulSoup

url = 'http://sportwiki.to/Плечи_-_упражнения_и_особенности_тренировки'
response = requests.get(url)

soup = BeautifulSoup(response.text, 'lxml')
quotes = soup.find_all('li')

file = open("Data/shoulders.txt", "w")
for quote in quotes:
    file.write(quote.text)
file.close()

'''internalLinks = [
    a.get('href') for a in soup.find_all('a', class_='mainpage-content')
    if a.get('href') and a.get('href').startswith('/')]

file = open("Data/urls.txt", "w")
for links in internalLinks:
    file.write("http://sportwiki.to" + links)'''
