import datetime
import random
from tempfile import template

from App.FetchRandomImages import FetchRandomImages
from App.ImageManager import ImageManager
from App.interfaces import ImageScaler

class Memegenerator:
    templates = []

    def __init__(self,templates,images_path,memes_path,water_mark):
        self.templates = templates
        self.images_path = images_path
        self.memes_path = memes_path 
        self.water_mark = water_mark

    def generate_meme(self):
        template = random.choice(self.templates)
        meme = template.fill_template(FetchRandomImages.get_random_images(number_of_images=len(template), path=self.images_path))
        ImageManager.put_watermark(self.memes_path,water_mark= self.water_mark)
        return meme
    
    def generate_and_save_meme(self):
        meme = self.generate_meme
        path = f"{self.meme_path}{datetime.now().strftime('%d-%m-%Y-%H-%M-%S')}.jpg"
        meme.save(path)
        return path 
