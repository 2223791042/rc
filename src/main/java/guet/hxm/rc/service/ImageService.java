package guet.hxm.rc.service;

import guet.hxm.rc.entity.Image;

import java.util.List;

public interface ImageService {
    List<Image> getImageList(String imageType);

    void addImage(Image image);

    void editImage(Image image);

    void delImage(Long imageId);

    Image getImage(Long imageId);
}
