package guet.hxm.rc.utils;

import guet.hxm.rc.VO.ResultVO;
import guet.hxm.rc.enums.ResultEnum;
//ResultVO：Spring  Boot框架，封装后台向前台传输的数据的类
public class ResultVOUtil {

    public static ResultVO success(Object object) {
        ResultVO resultVO = new ResultVO();
        resultVO.setData(object);
        resultVO.setCode(0);
        resultVO.setMsg("成功");
        return resultVO;
    }

    public static ResultVO success(String msg) {
        ResultVO resultVO = new ResultVO();
        resultVO.setData(null);
        resultVO.setCode(0);
        resultVO.setMsg(msg);
        return resultVO;
    }

    public static ResultVO success() {
        return success(null);
    }

    public static ResultVO error(Integer code, String msg) {
        ResultVO resultVO = new ResultVO();
        resultVO.setCode(code);
        resultVO.setMsg(msg);
        return resultVO;
    }

    public static ResultVO fail(String msg) {
        ResultVO resultVO = new ResultVO();
        resultVO.setCode(ResultEnum.FAIL.getCode());
        resultVO.setMsg(msg);
        return resultVO;
    }
}
