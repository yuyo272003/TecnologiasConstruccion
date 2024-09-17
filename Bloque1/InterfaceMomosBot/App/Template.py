from App.ImageManager import ImageManager
class Template:
    def __init__(self,cords_scale,template_image) -> None:
        self.__cords_scale = cords_scale
        self.__template = template_image

    def fill_template(self,images):
        filled_template = self.__template_image.copy()
        i = 0 
        for cord_scale in self.__cords_scale:
            rescale_image = ImageManager.scale(cord_scale["scale"],images[i])
            filled_template.paste(rescale_image,cord_scale["location"])
            i+=1


        return filled_template
    def __len__(self):
        len(self.__cords_scale)
        