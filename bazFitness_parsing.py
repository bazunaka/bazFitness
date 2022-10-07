import random
import requests
import pandas as pd
from bs4 import BeautifulSoup

url = 'http://sportwiki.to/Бицепс_-_упражнения_и_особенности_тренировки'
response = requests.get(url)

soup = BeautifulSoup(response.text, 'html.parser')
'''quotes = soup.find_all('a', class_="image")
result_list = {'name': []}

for quote in quotes:
    result_list['name'].append(quote.text)'''

images_list = []

images = soup.select('img')
for image in images:
    src = image.get('src')
    alt = image.get('alt')
    images_list.append({"src": src, "alt": alt})

for image in images_list:
    print(image)


def get_link_img(url):
    response = requests.get(url)
    soap = BeautifulSoup(response.content, "html.parser")
    links = soap.find_all("img", class_="serp-item__thumb justifier__thumb")
    i = 0
    while i > 5:
        for link in links:
            link = link.get("src")
            linked = "https:"+str(link)
            # writing to a file
            name = random.random()
            p = requests.get(linked)
            out = open(f"Data\Galery{name}.jpg", "wb")
            out.write(p.content)
            out.close()
            i = + 1


get_link_img(
    "https://yandex.ru/images/search?from=tabbar&text=сгибание%20рук%20на%20скамье%20скотта")

'''df = pd.DataFrame(result_list)
df.to_csv("Data/images.csv")'''

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
