package guet.hxm.rc.service.impl;

import guet.hxm.rc.dao.ImageMapper;
import guet.hxm.rc.entity.Image;
import guet.hxm.rc.entity.ImageExample;
import guet.hxm.rc.service.ImageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class ImageServiceImpl implements ImageService {
    @Autowired
    private ImageMapper imageMapper;

    @Override
    public List<Image> getImageList(String imageType) {
        ImageExample imageExample = new ImageExample();
        ImageExample.Criteria criteria = imageExample.createCriteria();
        criteria.andImageTypeEqualTo(imageType);
        return imageMapper.selectByExample(imageExample);
    }

    @Transactional
    @Override
    public void addImage(Image image) {
        imageMapper.insertSelective(image);
    }

    @Transactional
    @Override
    public void editImage(Image image) {
        imageMapper.updateByPrimaryKeySelective(image);
    }

    @Transactional
    @Override
    public void delImage(Long imageId) {
        imageMapper.deleteByPrimaryKey(imageId);
    }

    @Override
    public Image getImage(Long imageId) {
        return imageMapper.selectByPrimaryKey(imageId);
    }
}
