/*
SQLyog Ultimate v12.09 (64 bit)
MySQL - 8.0.18 : Database - rc
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`rc` /*!40100 DEFAULT CHARACTER SET latin1 */ /*!80016 DEFAULT ENCRYPTION='N' */;

USE `rc`;

/*Table structure for table `application` */

DROP TABLE IF EXISTS `application`;

CREATE TABLE `application` (
  `application_id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '申请id',
  `name` varchar(50) DEFAULT NULL COMMENT '姓名',
  `sex` varchar(1) DEFAULT NULL COMMENT '性别(M 男 F 女)',
  `birthday` date DEFAULT NULL COMMENT '出生日期',
  `nation` varchar(50) DEFAULT NULL COMMENT '民族',
  `native_add` varchar(100) DEFAULT NULL COMMENT '籍贯',
  `domicile` varchar(100) DEFAULT NULL COMMENT '目前所在地',
  `card_id` varchar(50) DEFAULT NULL COMMENT '身份证号码',
  `home_add` varchar(100) DEFAULT NULL COMMENT '家庭住址',
  `email` varchar(50) DEFAULT NULL COMMENT '邮箱',
  `telephone` varchar(20) DEFAULT NULL COMMENT '联系电话',
  `agent_name` varchar(50) DEFAULT NULL COMMENT '紧急联系人姓名',
  `agent_relative` varchar(20) DEFAULT NULL COMMENT '与本人关系',
  `agent_telephone` varchar(20) DEFAULT NULL COMMENT '紧急联系人电话',
  `academic_achi` varchar(200) DEFAULT NULL COMMENT '学术方面成就',
  `online_data` varchar(100) DEFAULT NULL COMMENT '在线资料',
  `introduce` varchar(1000) DEFAULT NULL COMMENT '自我介绍',
  `school` varchar(50) DEFAULT NULL COMMENT '学校名称',
  `education` varchar(1) DEFAULT NULL COMMENT '学历(0 大专 1本科 2研究生 3博士)',
  `research_field` varchar(50) DEFAULT NULL COMMENT '研究领域',
  `start_edu_time` date DEFAULT NULL COMMENT '开始教育时间',
  `end_edu_time` date DEFAULT NULL COMMENT '结束教育时间',
  `degree_status` varchar(1) DEFAULT NULL COMMENT '学位状态(Y 获得 N未获得)',
  `degree_name` varchar(100) DEFAULT NULL COMMENT '学位名称',
  `cource_score` varchar(20) DEFAULT NULL COMMENT '课程学分',
  `main_language` varchar(50) DEFAULT NULL COMMENT '主要教学语言',
  `language_name` varchar(50) DEFAULT NULL COMMENT '语言名称',
  `test_time` date DEFAULT NULL COMMENT '考试时间',
  `language_score` varchar(20) DEFAULT NULL COMMENT '成绩',
  `project_name` varchar(50) DEFAULT NULL COMMENT '项目名称',
  `project_start_time` date DEFAULT NULL COMMENT '项目开始时间',
  `project_end_time` date DEFAULT NULL COMMENT '项目结束时间',
  `project_add` varchar(100) DEFAULT NULL COMMENT '项目地点',
  `project_explain` varchar(400) DEFAULT NULL COMMENT '项目说明',
  `experience_type` varchar(1) DEFAULT NULL COMMENT '经历类型(0 学术研究 1专业经历 2志愿活动)',
  `exper_start_time` date DEFAULT NULL COMMENT '经历开始时间',
  `exper_end_time` date DEFAULT NULL COMMENT '经历结束时间',
  `experience_add` varchar(100) DEFAULT NULL COMMENT '经历地点',
  `experience_explain` varchar(400) DEFAULT NULL COMMENT '经历简要说明',
  `honor` varchar(400) DEFAULT NULL COMMENT '荣誉奖项',
  `sanction` varchar(1) DEFAULT NULL COMMENT '纪律处分(Y 是 N否)',
  `sanction_expain` varchar(400) DEFAULT NULL COMMENT '处分说明',
  `referee_name` varchar(50) DEFAULT NULL COMMENT '推荐人姓名',
  `referee_telephone` varchar(20) DEFAULT NULL COMMENT '推荐人电话',
  `referee_company` varchar(50) DEFAULT NULL COMMENT '推荐人单位',
  `referee_email` varchar(50) DEFAULT NULL COMMENT '推荐人邮箱',
  `resume_file` varchar(200) DEFAULT NULL COMMENT '简历',
  `academic_file` varchar(200) DEFAULT NULL COMMENT '学术论文',
  `score_file` varchar(200) DEFAULT NULL COMMENT '成绩单',
  `language_file` varchar(200) DEFAULT NULL COMMENT '外语成绩单',
  `degree_file` varchar(200) DEFAULT NULL COMMENT '学位',
  `announce_name` varchar(50) DEFAULT NULL COMMENT '声明姓名',
  `announce_time` date DEFAULT NULL COMMENT '声明时间',
  `application_status` varchar(1) DEFAULT NULL COMMENT '状态(0 保存 1提交)',
  PRIMARY KEY (`application_id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

/*Data for the table `application` */

insert  into `application`(`application_id`,`name`,`sex`,`birthday`,`nation`,`native_add`,`domicile`,`card_id`,`home_add`,`email`,`telephone`,`agent_name`,`agent_relative`,`agent_telephone`,`academic_achi`,`online_data`,`introduce`,`school`,`education`,`research_field`,`start_edu_time`,`end_edu_time`,`degree_status`,`degree_name`,`cource_score`,`main_language`,`language_name`,`test_time`,`language_score`,`project_name`,`project_start_time`,`project_end_time`,`project_add`,`project_explain`,`experience_type`,`exper_start_time`,`exper_end_time`,`experience_add`,`experience_explain`,`honor`,`sanction`,`sanction_expain`,`referee_name`,`referee_telephone`,`referee_company`,`referee_email`,`resume_file`,`academic_file`,`score_file`,`language_file`,`degree_file`,`announce_name`,`announce_time`,`application_status`) values (2,'fsadfd','F','2019-03-06','sadf','sd','sadf','asdf','asfd','2223791042@qq.com','sadf','asdf','asdf','asdf','asdf','sadf','asdf','asdf','1','sadf','2019-03-14','2019-03-13','Y','asdf','sadf','asdf','sadf','2019-03-20','asdf','asdf','2019-03-10','2019-03-13','sadf','asdf','0','2019-03-01','2019-03-14','asdf','asdf','asdf','N','asdf','sadf','sadf','asdf','asdf','http://localhost:8080/rc/application/fsadfd/视频进度.txt','http://localhost:8080/rc/application/fsadfd/视频进度.txt','http://localhost:8080/rc/application/fsadfd/视频进度.txt','http://localhost:8080/rc/application/fsadfd/视频进度.txt','http://localhost:8080/rc/application/fsadfd/视频进度.txt','fa','2019-03-12','0'),(3,'冰魅','F','2019-05-05','汉','广西南宁','广西桂林','452123199705103728','广西南宁','1610424323@qq.com','13557732847','张三','师生','12345678912','2019年，于桂林电子科技大学，开展时滞系统鲁棒控制研究，降低控制器设计的保守性和脆弱性，解决非线性时滞系统递推控制器难题。提出基于参数辨识的反馈控制器设计原理，克服辨识过程中对状态微分信号的依赖，揭示系统和增益的解析关系。提出自适应时变参数设计方法，突破了滞系统鲁棒控制算法在高动态流量下的性能瓶颈问题。SCI收录50篇，他人引用145次，EI收录71篇，专著1部。','http://139.159.210.214:8080/rc/','本人性格开朗、稳重、有活力，待人热情、真诚；工作认真负责，积极主动，能吃苦耐劳，用于承受压力，勇于创新；有很强的组织能力和团队协作精神，具有较强的适应能力；纪律性强，工作积极配合；意志坚强，具有较强的无私奉献精神。','桂林电子科技大学','1','数字媒体技术','2015-09-01','2019-06-05','Y','工学学位','85','中文、英语','CET4','2017-01-04','580','网站开发','2018-02-01','2019-05-26','深圳','无','0','2019-05-03','2019-05-25','美国','参与关于网站设计与开发的学术研究国际会议','在校期间多次获校奖学金\r\n参与众多比赛，取得了较好的成绩','N','无','张三','12345678912','桂林电子科技大学','1234567@qq.com','http://localhost:8080/rc/application/冰魅/本文件仅用于测试.pdf','http://localhost:8080/rc/application/冰魅/本文件仅用于测试.pdf','http://localhost:8080/rc/application/冰魅/本文件仅用于测试.pdf','http://localhost:8080/rc/application/冰魅/本文件仅用于测试.pdf','http://localhost:8080/rc/application/冰魅/本文件仅用于测试.pdf','冰魅','2019-05-26','1');

/*Table structure for table `friend_link` */

DROP TABLE IF EXISTS `friend_link`;

CREATE TABLE `friend_link` (
  `link_id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '友情链接id',
  `link_name` varchar(100) DEFAULT NULL COMMENT '友情链接名称',
  `link_image` varchar(200) DEFAULT NULL COMMENT '友情链接图片',
  `link_url` varchar(100) DEFAULT NULL COMMENT '友情链接地址',
  `is_blank` varchar(1) DEFAULT NULL COMMENT '是否新窗口打开(Y是 N否)',
  `add_time` date DEFAULT NULL COMMENT '添加时间',
  `link_order` int(11) DEFAULT NULL COMMENT '排列顺序',
  PRIMARY KEY (`link_id`)
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8;

/*Data for the table `friend_link` */

insert  into `friend_link`(`link_id`,`link_name`,`link_image`,`link_url`,`is_blank`,`add_time`,`link_order`) values (2,'桂林电子科技大学','http://119.23.49.138:8080/rc/image/friendLink/guet.jpg','www.guet.edu.cn','Y','2019-05-29',1),(3,'大连工业大学光子学研究所','http://119.23.49.138:8080/rc/image/friendLink/dlprc.jpg','http://rip.dlpu.edu.cn/','Y','2019-05-29',2),(4,'信息光学研究所','http://119.23.49.138:8080/rc/image/friendLink/xxprc.jpg','http://opticins.zjnu.edu.cn/','Y','2019-05-29',3),(5,'暨南大学纳米光子学研究所','http://119.23.49.138:8080/rc/image/friendLink/jnprc.jpg','https://photon.jnu.edu.cn/','Y','2019-05-29',4),(6,'澳门科技大学','http://119.23.49.138:8080/rc/image/friendLink/amkjdx.jpg','https://www.must.edu.mo/','Y','2019-05-29',5);

/*Table structure for table `hibernate_sequence` */

DROP TABLE IF EXISTS `hibernate_sequence`;

CREATE TABLE `hibernate_sequence` (
  `next_val` bigint(20) DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

/*Data for the table `hibernate_sequence` */

insert  into `hibernate_sequence`(`next_val`) values (22);

/*Table structure for table `image` */

DROP TABLE IF EXISTS `image`;

CREATE TABLE `image` (
  `image_id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '图片id',
  `image_name` varchar(20) DEFAULT NULL COMMENT '图片名称',
  `image_url` varchar(100) DEFAULT NULL COMMENT '图片url',
  `image_url_addr` varchar(50) DEFAULT NULL COMMENT '链接地址',
  `image_type` varchar(1) DEFAULT NULL COMMENT '图片类型',
  `image_order` int(11) DEFAULT NULL COMMENT '图片顺序',
  `image_desc` varchar(100) DEFAULT NULL COMMENT '图片描述',
  `image_author` varchar(30) DEFAULT NULL COMMENT '图片上传者',
  `image_time` date DEFAULT NULL COMMENT '图片上传时间',
  `image_is_blank` varchar(1) DEFAULT NULL COMMENT '在新窗口打开(0 否 1 是)',
  PRIMARY KEY (`image_id`)
) ENGINE=InnoDB AUTO_INCREMENT=36 DEFAULT CHARSET=utf8;

/*Data for the table `image` */

insert  into `image`(`image_id`,`image_name`,`image_url`,`image_url_addr`,`image_type`,`image_order`,`image_desc`,`image_author`,`image_time`,`image_is_blank`) values (33,'轮播图1','http://119.23.49.138:8080/rc/image/lunbo/pic_1.jpg','https://www.baidu.com','1',1,'轮播图','zhangsan','2019-10-29','1'),(34,'轮播图2','http://119.23.49.138:8080/rc/image/lunbo/pic_2.jpg','https://www.baidu.com','1',2,'轮播图2','zhangsan','2019-05-29','1'),(35,'轮播图3','http://119.23.49.138:8080/rc/image/lunbo/pic_3.png','https://www.baidu.com','1',3,'轮播图3','zhangsan','2019-05-29','1');

/*Table structure for table `inform` */

DROP TABLE IF EXISTS `inform`;

CREATE TABLE `inform` (
  `inform_id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '通知id',
  `inform_image` varchar(255) DEFAULT NULL COMMENT '通知图片',
  `inform_title` varchar(255) DEFAULT NULL COMMENT '通知标题',
  `inform_type_id` int(11) DEFAULT NULL COMMENT '通知类型',
  `inform_content` varchar(20000) DEFAULT NULL COMMENT '通知内容',
  `inform_author` varchar(20) DEFAULT NULL COMMENT '通知发布者',
  `inform_time` date DEFAULT NULL COMMENT '通知发布时间',
  `inform_status` varchar(1) DEFAULT NULL COMMENT '通知状态(0 保存 1发布)',
  `inform_visit` bigint(20) DEFAULT NULL COMMENT '通知访问量',
  PRIMARY KEY (`inform_id`)
) ENGINE=InnoDB AUTO_INCREMENT=18 DEFAULT CHARSET=utf8;

/*Data for the table `inform` */

insert  into `inform`(`inform_id`,`inform_image`,`inform_title`,`inform_type_id`,`inform_content`,`inform_author`,`inform_time`,`inform_status`,`inform_visit`) values (11,'http://119.23.49.138:8080/rc/image/inform/6.jpg','我中心硕士研究生获2018年广西研究生教育创新计划项目资助',1,'<p style=\"font-size:16px;font-family:philosopher-regular, 微软雅黑, &quot;color:#444444;background-color:#FFFFFF;text-indent:2em;\">\r\n	<span>根据广西区教育厅《关于申报2018年广西研究生教育创新计划项目的通知》（桂学位[2017]13号），本中心硕士研究生韦柳夏、鲍旭晖和席涛分别牵头申报的三项“广西研究生教育创新计划项目”获得资助（见附件1）。</span>\r\n</p>\r\n<p style=\"font-size:16px;font-family:philosopher-regular, 微软雅黑, &quot;color:#444444;background-color:#FFFFFF;text-indent:2em;\">\r\n	<span>韦柳夏申报的项目是《表面等离子体共振光纤传感器研究》，设计并搭建SPR光纤传感器系统，优化该类传感器的性能参数，并实现在生物医学方面的检测。</span>\r\n</p>\r\n<p style=\"font-size:16px;font-family:philosopher-regular, 微软雅黑, &quot;color:#444444;background-color:#FFFFFF;text-indent:2em;\">\r\n	鲍旭晖申报的项目是《螺旋光纤的制备方法与关键技术研究》，开发一种螺旋光纤的制备新方法，并完成几个相关器件的实际制作工作，并对通过这种方法制备的数种特殊纤芯螺旋光纤特性进行探究。\r\n</p>\r\n<p style=\"font-size:16px;font-family:philosopher-regular, 微软雅黑, &quot;color:#444444;background-color:#FFFFFF;text-indent:2em;\">\r\n	<span>席涛申报的项目是《基于热扩散技术的新型光纤器件制备方法》，提出了一种基于热扩散技术制备新型光纤器件的方法和技术。发明了一种制备新型光纤器件的方法，可以降低不同类型光纤接头损耗。</span>\r\n</p>','zhangsan','2019-05-06','1',6),(12,'http://119.23.49.138:8080/rc/image/inform/banner.png','第八届国际液晶光子学会议 SLCP2019',1,'<span style=\"color:#333333;font-family:Arial, &quot;font-size:16px;background-color:#FFFFFF;\">国际液晶光子学会议（International Symposium on Liquid Crystal Photonics, SLCP）是国际重要的液晶显示、光学技术与产业化大会。自2012年以来，每年举行一次，影响日益扩大。由中国物理学会液晶分会主办、华南师范大学承办的“第八届国际液晶光子学会议（SLCP2019）”，定于 2019年3月29日—31日在广东省广州市召开。</span><br />\r\n<span style=\"color:#333333;font-family:Arial, &quot;font-size:16px;background-color:#FFFFFF;\">本届会议邀请了液晶和光学相关领域的海内外知名专家学者做大会报告和邀请报告，交流展示国际、国内液晶和光学研究新成果、新进展、新技术、新经验；分析研讨国际液晶光子学的发展趋势和前沿动向。本届会议的召开是全球液晶光子学工作者开展学术交流、沟通研究信息、切磋经验体会、加强国际合作和推动成果转化的平台。</span> \r\n<p>\r\n	<br />\r\n</p>\r\n<p>\r\n	<b><span style=\"font-size:16px;\">一、重要时间节点</span></b> \r\n</p>\r\n<span style=\"color:#333333;font-family:Arial, &quot;font-size:16px;background-color:#FFFFFF;\">会议举办时间：2019年3月29-31日</span><br />\r\n<span style=\"color:#333333;font-family:Arial, &quot;font-size:16px;background-color:#FFFFFF;\">摘要截止时间：2019年2月15日</span><br />\r\n<span style=\"color:#333333;font-family:Arial, &quot;font-size:16px;background-color:#FFFFFF;\">Early Bird注册截止时间：2019年2月28日</span><br />\r\n<b><span style=\"font-size:16px;\">二、会议议题</span></b><br />\r\n<span style=\"color:#333333;font-family:Arial, &quot;font-size:16px;background-color:#FFFFFF;\">1、液晶相、结构与排列</span><br />\r\n<span style=\"color:#333333;font-family:Arial, &quot;font-size:16px;background-color:#FFFFFF;\">2、分子设计、合成及液晶材料与复合材料</span><br />\r\n<span style=\"color:#333333;font-family:Arial, &quot;font-size:16px;background-color:#FFFFFF;\">3、显示技术</span><br />\r\n<span style=\"color:#333333;font-family:Arial, &quot;font-size:16px;background-color:#FFFFFF;\">4、液晶取向材料与技术</span><br />\r\n<span style=\"color:#333333;font-family:Arial, &quot;font-size:16px;background-color:#FFFFFF;\">5、光学器件，包括自适应透镜和自适应光学</span><br />\r\n<span style=\"color:#333333;font-family:Arial, &quot;font-size:16px;background-color:#FFFFFF;\">6、智能窗</span><br />\r\n<span style=\"color:#333333;font-family:Arial, &quot;font-size:16px;background-color:#FFFFFF;\">7、理论与建模</span><br />\r\n<span style=\"color:#333333;font-family:Arial, &quot;font-size:16px;background-color:#FFFFFF;\">8、光与自响应材料</span><br />\r\n<span style=\"color:#333333;font-family:Arial, &quot;font-size:16px;background-color:#FFFFFF;\">9、传感器</span><br />\r\n<span style=\"color:#333333;font-family:Arial, &quot;font-size:16px;background-color:#FFFFFF;\">10、聚合物、弹性体和凝胶</span><br />\r\n<span style=\"color:#333333;font-family:Arial, &quot;font-size:16px;background-color:#FFFFFF;\">11、活性液晶</span><br />\r\n<span style=\"color:#333333;font-family:Arial, &quot;font-size:16px;background-color:#FFFFFF;\">12、微波与太赫兹器件</span><br />\r\n<span style=\"color:#333333;font-family:Arial, &quot;font-size:16px;background-color:#FFFFFF;\">13、软机器人</span><br />','zhangsan','2019-03-20','1',6),(13,'http://119.23.49.138:8080/rc/image/inform/14973424038136686.png','“2017国际应用光学与光子学技术交流会”（AOPC 2017）顺利闭幕',1,'<p>\r\n	<span style=\"font-size:16px;\">2017国际应用光学与光子学技术交流会</span><span style=\"font-family:Arial, Helvetica, sans-serif;font-size:16px;background-color:#FFFFFF;\">（AOPC2017）于2017年6月4日-6日在北京国际会议中心成功举办，与会专家、代表千余人，国际参会专家、代表约70人。秉承“学术一流、创新一流、合作一流”的宗旨，本届大会被认为是报告交流和粘贴交流水平均较高的一届，得到了国内外学术、技术和产业届的高度认可。</span> \r\n</p>\r\n<p>\r\n	<span style=\"font-family:Arial, Helvetica, sans-serif;font-size:16px;background-color:#FFFFFF;\"><span style=\"font-family:Arial, Helvetica, sans-serif;font-size:16px;background-color:#FFFFFF;\">AOPC大会由中国光学工程学会和SPIE联合主办，是中国光学工程学会年会，每两年一届。AOPC2017的技术主办方有韩国光学学会 (OSK)、欧洲光学学会（EOS）、日本光学学会（OSJ）、新加坡光学与光子学学会（OPSS）。本地承办和联办方包括中国宇航学会光电技术专业委员会、光电信息控制和安全技术重点实验室、微光夜视技术重点实验室、清华大学、浙江大学、上海交通大学、北京航空航天大学、大连理工大学、南京理工大学、北京理工大学、电子科技大学、吉林大学超分子结构与材料国家重点实验室、华东师范大学精密光谱科学与技术国家重点实验室、复杂产品智能制造系统技术国家重点实验室、江苏省光谱成像与智能感知重点实验室、光电成像技术与系统教育部重点实验室、红外探测器技术航空科技重点实验室、纳米光子学与超精密光电系统北京市重点实验室，等50余单位。</span><span style=\"font-size:16px;\"></span><br />\r\n</span> \r\n</p>','zhangsan','2017-05-08','1',7),(15,'http://119.23.49.138:8080/rc/image/inform/1.jpg','关于举办“二维材料光子学和光电子学”学术讲座的通知',2,'<p style=\"font-family:宋体;font-size:16px;background-color:#FFFFFF;\">\r\n	<span style=\"font-family:宋体, simsun;\">为了让广大师生有更多的机会接触到光子学的，我中心特邀<span style=\"font-family:宋体, simsun;font-size:16px;background-color:#FFFFFF;\">鲍桥梁</span>教授来我校讲学，欢迎广大师生参与！！！</span> \r\n</p>\r\n<p style=\"font-size:16px;background-color:#FFFFFF;\">\r\n	<span style=\"font-family:宋体, simsun;font-size:16px;background-color:#FFFFFF;\">以下是具体的内容详情：</span>\r\n</p>\r\n<p style=\"font-family:宋体;font-size:16px;background-color:#FFFFFF;\">\r\n	<span style=\"font-family:宋体, simsun;\">题目：二维材料光子学和光电子学</span> \r\n</p>\r\n<p style=\"font-family:宋体;font-size:16px;background-color:#FFFFFF;\">\r\n	<span style=\"font-family:文泉驛點陣正黑;\"><span style=\"font-family:宋体, simsun;\">主讲：鲍桥梁教授</span></span> \r\n</p>\r\n<p style=\"font-family:宋体;font-size:16px;background-color:#FFFFFF;\">\r\n	<span style=\"font-family:宋体, simsun;\">时间：</span><span><span style=\"font-family:宋体, simsun;\">2019</span></span><span style=\"font-family:宋体, simsun;\">年</span><span><span style=\"font-family:宋体, simsun;\">6</span></span><span style=\"font-family:宋体, simsun;\">月</span><span><span style=\"font-family:宋体, simsun;\">9</span></span><span style=\"font-family:宋体, simsun;\">日</span><span><span style=\"font-family:宋体, simsun;\">15:00</span></span> \r\n</p>\r\n<p style=\"font-family:宋体;font-size:16px;background-color:#FFFFFF;\">\r\n	<span style=\"font-family:文泉驛點陣正黑;\"><span style=\"font-family:宋体, simsun;\">地点：桂林电子科技大学花江校区，2教308室</span></span> \r\n</p>\r\n<p style=\"font-family:宋体;font-size:16px;background-color:#FFFFFF;\">\r\n	<span style=\"font-family:文泉驛點陣正黑;\"><span><span style=\"font-family:宋体, simsun;\">主办：电子工程与自动化学学、桂电光子学研究中心</span></span></span> \r\n</p>','zhangsan','2019-05-25','1',10),(16,'http://119.23.49.138:8080/rc/image/inform/new_item1.jpg','光子学研究中心网站正式上线',1,'光子学研究中心网站正式上线！各种功能，等你体验！','zhangsan','2019-05-25','1',3);

/*Table structure for table `inform_type` */

DROP TABLE IF EXISTS `inform_type`;

CREATE TABLE `inform_type` (
  `type_id` int(11) NOT NULL AUTO_INCREMENT COMMENT '类型id',
  `type_name` varchar(50) DEFAULT NULL COMMENT '类型名称',
  `type_author` varchar(50) DEFAULT NULL COMMENT '类型创建者',
  `type_time` date DEFAULT NULL COMMENT '类型创建时间',
  PRIMARY KEY (`type_id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

/*Data for the table `inform_type` */

insert  into `inform_type`(`type_id`,`type_name`,`type_author`,`type_time`) values (1,'校园信息','zhangsan','2019-03-18'),(2,'校内通知','zhangsan','2019-05-25');

/*Table structure for table `news` */

DROP TABLE IF EXISTS `news`;

CREATE TABLE `news` (
  `news_id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '新闻id',
  `news_image` varchar(255) DEFAULT NULL COMMENT '新闻图片',
  `news_title` varchar(255) DEFAULT NULL COMMENT '新闻标题',
  `news_type_id` int(11) NOT NULL COMMENT '新闻类型',
  `news_content` varchar(20000) DEFAULT NULL COMMENT '新闻内容',
  `news_author` varchar(20) DEFAULT NULL COMMENT '新闻发表者',
  `news_time` date DEFAULT NULL COMMENT '新闻发表时间',
  `news_status` varchar(1) DEFAULT '0' COMMENT '新闻状态(0 保存 1发布)',
  `news_visit` bigint(20) DEFAULT '0' COMMENT '新闻访问量',
  PRIMARY KEY (`news_id`)
) ENGINE=InnoDB AUTO_INCREMENT=40 DEFAULT CHARSET=utf8;

/*Data for the table `news` */

insert  into `news`(`news_id`,`news_image`,`news_title`,`news_type_id`,`news_content`,`news_author`,`news_time`,`news_status`,`news_visit`) values (33,'http://119.23.49.138:8080/rc/image/news/6.jpg','苑立波教授获得装发部“重点预研项目”资助',3,'<span style=\"color:#444444;font-family:philosopher-regular, 微软雅黑, &quot;font-size:16px;background-color:#FFFFFF;\"> \r\n<p style=\"font-family:&quot;font-size:15px;color:#666666;\">\r\n	2017年7月31日，军委装备发展部预研管理中心公布了2017年度预研项目评审结果，此次共批准预研项目196项，其中包括重点项目64项，单项获批金额最高400万元，最低40万元。由苑立波教授主持申报的“基于多芯光纤的柔性蒙皮形状传感技术研究” 重点项目获得了250万元的直接经费资助。\r\n</p>\r\n<p style=\"font-family:&quot;font-size:15px;color:#666666;\">\r\n	本项目旨在针对未来飞行器环境感知与外形自适应主动控制的需求，重点突破多芯光纤形状自主感知与诊断、曲率重建、可视化等关键技术。研究内容包括：（1）柔性蒙皮结构形变机理研究；（2）多芯光纤三维形状传感机理研究及结构设计；（3）多芯光纤及光纤光栅制作技术与传感特性研究；\r\n</p>\r\n<p style=\"font-family:&quot;font-size:15px;color:#666666;\">\r\n	（4）三维形状传感信号解调和算法研究；（5）高精度三维形状重构与图像显示技术研究。\r\n</p>\r\n</span>','zhangsan','2018-12-18','1',16),(34,'http://119.23.49.138:8080/rc/image/news/3.jpg','苑立波教授出访澳门科技大学',3,'<span style=\"color:#444444;font-family:philosopher-regular, 微软雅黑, &quot;font-size:16px;background-color:#FFFFFF;\">应澳门科技大学资讯科技学院助理院长李建庆教授邀请，我院光子学研究中心主任苑立波教授于2018年1月17日-19日到澳门科技大学进行为期三天的学术交流。在苑教授访澳期间，双方就“Optical Fiber Based Powerful Tools for Living Cells Investigation”课题的开展进行深入探讨，对交叉学科光纤技术在活体细胞研究的应用领域展开了面对面的交流与思想碰撞。参与讨论的嘉宾包括澳门科技大学资讯科技学院李建庆教授，澳门科技大学中医药学院赵永华副教授，中药质量研究国家重点实验室（澳门科技大学）张伟副教授，香港中文大学（深圳）宋红彬老师。此次出访，为进一步推动桂林电子科技大学与澳门科技大学的深入交流与合作迈开了实质性的一步，为双方今后开展科研合作奠定了良好的基础。</span>','zhangsan','2018-01-21','1',7),(35,'http://119.23.49.138:8080/rc/image/news/5.jpg','我中心开展小组学术技术交流会',1,'<span style=\"color:#444444;font-family:philosopher-regular, 微软雅黑, &quot;font-size:16px;background-color:#FFFFFF;\">2017年12月8日应桂林电子科技大学电子工程与自动化学院光子学研究中心的邀请、韩国延世大学Kyunghwan Oh （吴景焕）教授于12月8日来我校讲学，并在金鸡岭校区F电2开展了主题为：“Fiber optic platform for emerging sciences”广大师生踊跃参与，并积极发言提出问题。随后来到我中心，与中心教师、博士和研究生进行了深入的交流和探讨，并合影留念.</span>','zhangsan','2017-12-10','1',4),(36,'http://119.23.49.138:8080/rc/image/news/1.jpg','我中心硕士研究生获2018年广西研究生教育创新计划项目资助',1,'<p style=\"font-size:16px;font-family:philosopher-regular, 微软雅黑, &quot;color:#444444;background-color:#FFFFFF;text-indent:2em;\">\r\n	<span>根据广西区教育厅《关于申报2018年广西研究生教育创新计划项目的通知》（桂学位[2017]13号），本中心硕士研究生韦柳夏、鲍旭晖和席涛分别牵头申报的三项“广西研究生教育创新计划项目”获得资助（见附件1）。</span>\r\n</p>\r\n<p style=\"font-size:16px;font-family:philosopher-regular, 微软雅黑, &quot;color:#444444;background-color:#FFFFFF;text-indent:2em;\">\r\n	<span>韦柳夏申报的项目是《表面等离子体共振光纤传感器研究》，设计并搭建SPR光纤传感器系统，优化该类传感器的性能参数，并实现在生物医学方面的检测。</span>\r\n</p>\r\n<p style=\"font-size:16px;font-family:philosopher-regular, 微软雅黑, &quot;color:#444444;background-color:#FFFFFF;text-indent:2em;\">\r\n	鲍旭晖申报的项目是《螺旋光纤的制备方法与关键技术研究》，开发一种螺旋光纤的制备新方法，并完成几个相关器件的实际制作工作，并对通过这种方法制备的数种特殊纤芯螺旋光纤特性进行探究。\r\n</p>\r\n<p style=\"font-size:16px;font-family:philosopher-regular, 微软雅黑, &quot;color:#444444;background-color:#FFFFFF;text-indent:2em;\">\r\n	<span>席涛申报的项目是《基于热扩散技术的新型光纤器件制备方法》，提出了一种基于热扩散技术制备新型光纤器件的方法和技术。发明了一种制备新型光纤器件的方法，可以降低不同类型光纤接头损耗。</span>\r\n</p>','zhangsan','2019-05-05','1',38),(37,'http://119.23.49.138:8080/rc/image/news/4.jpg','韩国延世大学Kyunghwan Oh （吴景焕）教授来校讲学',1,'<p style=\"font-size:16px;font-family:philosopher-regular, 微软雅黑, &quot;color:#444444;background-color:#FFFFFF;text-indent:2em;\">\r\n	2017年12月8日应桂林电子科技大学电子工程与自动化学院光子学研究中心的邀请韩国延世大学Kyunghwan Oh （吴景焕）教授于12月8日来我校讲学，并在金鸡岭校区F电2开展了主题为：“Fiber optic platform for emerging sciences”广大师生踊跃参与，并积极发言提出问题。随后来到我中心，与中心教师、博士和研究生进行了深入的交流和探讨，并合影留念。\r\n</p>\r\n<p style=\"font-size:16px;font-family:philosopher-regular, 微软雅黑, &quot;color:#444444;background-color:#FFFFFF;text-indent:2em;\">\r\n	报告摘要：Optical fiber technology for broadband high-speed communications has matured in recent years and conventional single mode optical has become a technical commodity. With the development of specialty fibers with structured air hole arrays, fiber optics has been moving in new scientific directions that were not attainable in conventional fibers. In this talk, hollow optical fiber (HOF) composed of a single hole and a single ring core and its various applications will be reviewed in terms of optical trapping, surface plasmoics, liquid physics, and light momentum delivery.\r\n</p>','zhangsan','2018-07-05','1',4);

/*Table structure for table `news_type` */

DROP TABLE IF EXISTS `news_type`;

CREATE TABLE `news_type` (
  `type_id` int(11) NOT NULL AUTO_INCREMENT COMMENT '类型id',
  `type_name` varchar(50) DEFAULT NULL COMMENT '类型名称',
  `type_author` varchar(50) DEFAULT NULL COMMENT '类型创建者',
  `type_time` date DEFAULT NULL COMMENT '类型创建时间',
  PRIMARY KEY (`type_id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8;

/*Data for the table `news_type` */

insert  into `news_type`(`type_id`,`type_name`,`type_author`,`type_time`) values (1,'校园资讯','zhangsan','2019-02-21'),(2,'计算机','zhangsan','2019-02-06'),(3,'重要信息','zhangsan','2019-02-13'),(5,'科研动态','zhangsan','2019-05-27');

/*Table structure for table `open_academic` */

DROP TABLE IF EXISTS `open_academic`;

CREATE TABLE `open_academic` (
  `academic_id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '学术id',
  `academic_name` varchar(200) DEFAULT NULL COMMENT '学术名称',
  `academic_author` varchar(200) DEFAULT NULL COMMENT '学术作者',
  `academic_year` varchar(4) DEFAULT NULL COMMENT '学术年份',
  `academic_type` int(11) DEFAULT NULL COMMENT '学术类型(0 论文 1 期刊 2 著作)',
  `academic_download_link` varchar(500) DEFAULT NULL COMMENT '学术下载链接',
  `academic_download_quantity` int(11) DEFAULT NULL COMMENT '学术下载量',
  PRIMARY KEY (`academic_id`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8;

/*Data for the table `open_academic` */

insert  into `open_academic`(`academic_id`,`academic_name`,`academic_author`,`academic_year`,`academic_type`,`academic_download_link`,`academic_download_quantity`) values (5,'_生物医学光子学新技术及进展_专题前言','张镇西','2019',1,'http://119.23.49.138:8080/rc/openAcademic/_生物医学光子学新技术及进展_专题前言_张镇西.pdf',4),(6,'第8届国际应用光学与光子学技术交流大会','红外与激光工程','2019',1,'http://119.23.49.138:8080/rc/openAcademic/_生物医学光子学新技术及进展_专题前言_张镇西.pdf',0),(7,'随机位相菲涅耳透镜阵列激光束匀化','裴宪梓','2018',2,'http://119.23.49.138:8080/rc/openAcademic/_生物医学光子学新技术及进展_专题前言_张镇西.pdf',0);

/*Table structure for table `partner` */

DROP TABLE IF EXISTS `partner`;

CREATE TABLE `partner` (
  `partner_id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '合作伙伴id',
  `partner_name` varchar(100) DEFAULT NULL COMMENT '合作伙伴姓名',
  `partner_link_addr` varchar(100) DEFAULT NULL COMMENT '链接地址',
  `partner_is_blank` varchar(1) DEFAULT NULL COMMENT '是否新窗口打开(Y N)',
  `partner_img` varchar(100) DEFAULT NULL COMMENT '合作伙伴图片',
  PRIMARY KEY (`partner_id`)
) ENGINE=InnoDB AUTO_INCREMENT=20 DEFAULT CHARSET=utf8;

/*Data for the table `partner` */

insert  into `partner`(`partner_id`,`partner_name`,`partner_link_addr`,`partner_is_blank`,`partner_img`) values (5,'澳门科技大学','https://www.must.edu.mo/cn/fi','Y','http://119.23.49.138:8080/rc/image/partner/cp_am.png'),(7,'韩国延世大学','https://www.yonsei.ac.kr/en_sc/index.jsp','Y','http://119.23.49.138:8080/rc/image/partner/cp_ysdx.jpg'),(8,'桂林理工大学','http://www.glut.edu.cn/','Y','http://119.23.49.138:8080/rc/image/partner/cp_gllg.jpg'),(9,'广西师范大学','http://www.gxnu.edu.cn/','Y','http://119.23.49.138:8080/rc/image/partner/cp_gxsf.jpg'),(10,'广西大学','http://www.gxu.edu.cn/','Y','http://119.23.49.138:8080/rc/image/partner/cp_gxdx.png'),(11,'香港理工大学','https://www.polyu.edu.hk/web/en/home/index.html','Y','http://119.23.49.138:8080/rc/image/partner/cp_xglg.png'),(12,'深圳大族激光','https://www.hanslaser.com/','Y','http://119.23.49.138:8080/rc/image/partner/cp_dzjg.jpg'),(13,'武汉理工大学','http://www.whut.edu.cn/','Y','http://119.23.49.138:8080/rc/image/partner/cp_whlg.png'),(14,'上海交通大学','https://www.sjtu.edu.cn/','Y','http://119.23.49.138:8080/rc/image/partner/cp_shjd.png'),(16,'阿德莱德大学','https://www.adelaide.edu.au/','Y','http://119.23.49.138:8080/rc/image/partner/cp_adly.jpg'),(17,'澳大利亚新南威尔士大学','https://www.unsw.edu.au/','Y','http://119.23.49.138:8080/rc/image/partner/cp_xglg.png'),(19,'哈哈哈','https://www.baidu.com','Y','http://119.23.49.138:8080/rc/image/partner/cp_xglg.png');

/*Table structure for table `rec_email` */

DROP TABLE IF EXISTS `rec_email`;

CREATE TABLE `rec_email` (
  `email_id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT 'id',
  `email` varchar(50) DEFAULT NULL COMMENT '邮箱',
  `code` varchar(10) DEFAULT NULL COMMENT '验证码',
  `is_confirm` varchar(1) DEFAULT NULL COMMENT '是否确认(Y 是 N否)',
  `send_time` date DEFAULT NULL COMMENT '发送时间',
  PRIMARY KEY (`email_id`)
) ENGINE=InnoDB AUTO_INCREMENT=16 DEFAULT CHARSET=utf8;

/*Data for the table `rec_email` */

insert  into `rec_email`(`email_id`,`email`,`code`,`is_confirm`,`send_time`) values (1,'2223791042@qq.com','687f','Y','2019-03-23'),(6,'2652706881@qq.com','60bd','N','2019-03-23'),(7,'824368602@qq.com','f8fc','N','2019-03-25'),(8,'1610424323@qq.com','2dfd','Y','2019-05-05'),(9,'35358619@qq.com','caae','N','2019-05-26'),(10,'3535867619@qq.com','b0e4','Y','2019-05-26'),(14,'3535867619@qq.com','704e','N','2019-05-29'),(15,'1412077710@qq.com','6363','Y','2019-05-29');

/*Table structure for table `rec_user` */

DROP TABLE IF EXISTS `rec_user`;

CREATE TABLE `rec_user` (
  `user_id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '用户id',
  `email` varchar(50) DEFAULT NULL COMMENT '邮箱',
  `password` varchar(50) DEFAULT NULL COMMENT '密码',
  `name` varchar(50) DEFAULT NULL COMMENT '姓名',
  `sex` varchar(1) DEFAULT NULL COMMENT '性别(M 男 F女)',
  `birthday` date DEFAULT NULL COMMENT '生日',
  `card_id` varchar(50) DEFAULT NULL COMMENT '身份证',
  `graduate_sch` varchar(50) DEFAULT NULL COMMENT '毕业院校',
  PRIMARY KEY (`user_id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;

/*Data for the table `rec_user` */

insert  into `rec_user`(`user_id`,`email`,`password`,`name`,`sex`,`birthday`,`card_id`,`graduate_sch`) values (1,'2223791042@qq.com','123456','宋远征','M','2019-03-06','23018319970228167X','桂林电子科技大学'),(2,'1610424323@qq.com','456123','何冰梅','F','2019-05-05','452123199705103728','桂电'),(4,'1412077710@qq.com','123456','苪玫','F','2019-05-29','452123199905103788','桂电');

/*Table structure for table `student` */

DROP TABLE IF EXISTS `student`;

CREATE TABLE `student` (
  `student_id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '学生ID',
  `student_name` varchar(10) DEFAULT NULL COMMENT '学生姓名',
  `graduation_school` varchar(20) DEFAULT NULL COMMENT '毕业院校',
  `research_field` varchar(100) DEFAULT NULL COMMENT '研究领域',
  `belong_grade` varchar(10) DEFAULT NULL COMMENT '所属年级',
  `student_icon` varchar(100) DEFAULT NULL COMMENT '头像',
  `upload_time` date DEFAULT NULL COMMENT '上传时间',
  `student_status` varchar(1) DEFAULT NULL COMMENT '状态(0 保存 1 发布)',
  PRIMARY KEY (`student_id`)
) ENGINE=InnoDB AUTO_INCREMENT=13 DEFAULT CHARSET=utf8;

/*Data for the table `student` */

insert  into `student`(`student_id`,`student_name`,`graduation_school`,`research_field`,`belong_grade`,`student_icon`,`upload_time`,`student_status`) values (3,'纪竞凯（硕士研究生）','桂林电子科技大学','研究方向为光动力操控技术，先主要从事新型光纤拉曼探针的研究。','2018','http://119.23.49.138:8080/rc/image/student/stu2.jpg','2019-05-06','1'),(4,'申泽（硕士研究生）','桂林电子科技大学','研究方向为光镊，目前主要从事七芯光纤光镊研究','2018','http://119.23.49.138:8080/rc/image/student/白底照片.jpg','2019-05-06','1'),(5,'李晟（硕士研究生）','桂林电子科技大学','研究方向：纤维集成光学','2018','http://119.23.49.138:8080/rc/image/student/李晟.jpg','2019-05-06','1'),(6,'权志强（硕士研究生）','桂林电子科技大学','研究方向： 单光纤表面粗糙度测量，单光纤细胞荧光光谱测量','2018','http://119.23.49.138:8080/rc/image/student/CC52C6E09C5AD9E0278FB898EEBA24B6 (1).jpg','2019-05-06','1'),(7,'杜佳豪（硕士研究生）','桂林电子科技大学','研究方向：光电信息技术及仪器','2018','http://119.23.49.138:8080/rc/image/student/426CDEC949BBE56869969F9D3AAF199C.png','2019-05-06','1'),(8,'鲍旭晖（硕士研究生）','桂林电子科技大学','研究方向：旋光纤制备及其关键技术研究','2017','http://119.23.49.138:8080/rc/image/student/鲍旭辉.jpg','2019-05-06','1'),(9,'席涛（硕士研究生）','桂林电子科技大学','研究方向：光纤热扩散技术','2017','http://119.23.49.138:8080/rc/image/student/席涛.png','2019-05-06','1'),(11,'韦柳夏（硕士研究生）','桂林电子科技大学','表面等离子体共振传感器','2017','http://119.23.49.138:8080/rc/image/student/韦柳夏.jpg','2019-05-06','1');

/*Table structure for table `teacher` */

DROP TABLE IF EXISTS `teacher`;

CREATE TABLE `teacher` (
  `teacher_id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '教师id',
  `name` varchar(50) DEFAULT NULL COMMENT '教师姓名',
  `college` varchar(100) DEFAULT NULL COMMENT '所在学院',
  `appellation` varchar(100) DEFAULT NULL COMMENT '职称',
  `job` varchar(100) DEFAULT NULL COMMENT '职务',
  `email` varchar(100) DEFAULT NULL COMMENT '邮箱',
  `research_field` varchar(100) DEFAULT NULL COMMENT '研究领域',
  `image` varchar(100) DEFAULT NULL COMMENT '图片',
  `teacher_order` int(11) DEFAULT NULL COMMENT '排列顺序',
  `update_time` date DEFAULT NULL COMMENT '更新时间',
  `status` varchar(1) DEFAULT NULL COMMENT '发布状态',
  `introduce` varchar(20000) DEFAULT NULL COMMENT '个人介绍',
  PRIMARY KEY (`teacher_id`)
) ENGINE=InnoDB AUTO_INCREMENT=14 DEFAULT CHARSET=utf8;

/*Data for the table `teacher` */

insert  into `teacher`(`teacher_id`,`name`,`college`,`appellation`,`job`,`email`,`research_field`,`image`,`teacher_order`,`update_time`,`status`,`introduce`) values (3,'苑立波','电子工程与自动化学院','教授','中心主任','lbyuan@vip.sina.com','微结构光纤，纤维集成光器件，光操纵技术，光纤传感技术','http://119.23.49.138:8080/rc/image/teacher/teacher_1.jpg',1,'2019-05-29','1','<p class=\"zj-title\" style=\"font-family:&quot;font-size:15px;color:#666666;\">\r\n	<strong><span style=\"color:#008C3E;\">一、个人简况</span></strong> \r\n</p>\r\n<p class=\"zj-content\" style=\"font-family:&quot;font-size:15px;color:#444444;background-color:#FFFFFF;\">\r\n	苑立波，男，1962年11月生，桂林电子科技大学教授，博士，博士生导师。光子科学与技术研究中心主任。中国光学学会理事；国际光纤传感器学术会议（OFS-25）TPC共主席；中国光学学会纤维光学与集成光学专业委员会副主任，常务委员；中国光学学会光电技术专业委员会副主任，常务委员；中国光学工程学会光纤传感技术专家工作委员会暨中国光纤传感技术及产业创新联盟常务副主席；国家自然科学基金委员会第十三届信息科学部专家评审组成员；国家科学技术奖评审专家。 2003年毕业于香港理工大学，获博士学位。1995-1997年在美国新泽西理工学院访问研究员，2011年，在日本东京大学访问研究员。1997年获国务院政府特殊津贴。2002年，获教育部第三届高校优秀青年教师奖。2006年，入选“新世纪百千万人才工程”国家级人选。 主持了国家重大科学仪器设备开发专项，国家973前期专项，国防863项目，科技部国际合作重大项目，国家自然科学基金重点项目、重大项目（课题）、仪器专项等30多个项目。发表被SCI收录的学术论文160余篇。获得国家发明技术授权专利100余项、国际授权专利1项。出版学术专著3部。\r\n</p>\r\n<p class=\"zj-title\" style=\"font-family:&quot;font-size:15px;color:#666666;\">\r\n	<strong><span style=\"color:#008C3E;\">二、教育背景</span></strong> \r\n</p>\r\n<p class=\"zj-content\" style=\"font-family:&quot;font-size:15px;color:#444444;background-color:#FFFFFF;\">\r\n	1999年－2003年，香港理工大学，获得光电子学博士学位；<br />\r\n1987年－1990年，哈尔滨船舶工程学院，电子工程系，获得工学硕士学位；<br />\r\n1980年－1984年，黑龙江大学，物理系，获得理学学士学位\r\n</p>\r\n<p class=\"zj-title\" style=\"font-family:&quot;font-size:15px;color:#666666;\">\r\n	<strong><span style=\"color:#008C3E;\">三、主要荣誉</span></strong> \r\n</p>\r\n<p class=\"zj-content\" style=\"font-family:&quot;font-size:15px;color:#444444;background-color:#FFFFFF;\">\r\n	获得黑龙江省自然科学一等奖、科技进步二等奖各一项（均排名第一）\r\n</p>\r\n<p class=\"zj-title\" style=\"font-family:&quot;font-size:15px;color:#666666;\">\r\n	<strong><span style=\"color:#008C3E;\">四、学术活动</span></strong> \r\n</p>\r\n<p class=\"zj-content\" style=\"font-family:&quot;font-size:15px;color:#444444;background-color:#FFFFFF;\">\r\n	中国光学学会理事&nbsp;<br />\r\n中国光学学会纤维与集成光学专业委员会副主任<br />\r\n常务委员 中国光学学会光电技术专业委员会副主任，常务委员&nbsp;<br />\r\n中国光学工程学会光纤传感技术专家工作委员会暨中国光纤传感技术及产业创新联盟常务副主席<br />\r\n2011年中国光纤传感学术会议，大会主席&nbsp;<br />\r\n国际光纤传感器学术会议（OFS-25）TPC共主席<br />\r\n美国光学学会期刊 Applied Optics；Topical Editor<br />\r\n中国光学学会期刊 Chinese Optics Letters，Topical Editor\r\n</p>\r\n<p style=\"font-family:&quot;font-size:15px;color:#666666;\">\r\n	<strong><span style=\"color:#008C3E;\">五、教学信息</span></strong> \r\n</p>\r\n<p class=\"zj-content\" style=\"font-family:&quot;font-size:15px;color:#444444;background-color:#FFFFFF;\">\r\n	在哈尔滨工程大学任教32年，承担了本科生、硕士、博士研究生的课程教学任务9门，主持的本科生课程《光纤理论与技术》被评为国家级精品课程。获得黑龙江省优秀教学成果一等奖、二等奖各一项，主编并出版了国防科工委“十五”重点计划立项教材《光纤实验技术》。\r\n</p>\r\n<p class=\"zj-title\" style=\"font-family:&quot;font-size:15px;color:#666666;\">\r\n	<strong><span style=\"color:#008C3E;\">六、主要论文</span></strong> \r\n</p>\r\n<p class=\"zj-content\" style=\"font-family:&quot;font-size:15px;color:#444444;background-color:#FFFFFF;\">\r\n	[1]Hongchang Deng,Yaxun Zhang,Tinging Yuan, Xiaotong Zhang,Yu Zhang, Zhihai Liu, and Libo Yuan，Fiber-Based Optical Gun for Particle Shooting，ACS Photonics, 2017,4(3), pp 642–648<br />\r\n[2]Chunying Guan, Tingting Yuan, Rang Chu, Yize Shen, Zheng Zhu, Jinhui Shi, Ping Li, Libo Yuan, and Gilberto Brambilla, Generation of ultra-wideband achromatic Airy plasmons on a graphene surface, Optics Letters.42, 563-5 66 (2017)<br />\r\n[3]Zhihai Liu, Lu Liu, Zongda Zhu, Yu Zhang, Yong Wei, Xiaonan Zhang, Enming Zhao, Yaxun Zhang, Jun Yang, and Libo Yuan, Whispering gallery mode temperature sensor of liquid microresonastor, Opt. Lett. 41, 4649-4652 (2016)\r\n</p>'),(4,'邓洪昌','电子工程与自动化学院','副教授','中心研究员','123456789@qq.com','微结构光纤，纤维集成光器件，光操纵技术，光纤传感技术','http://119.23.49.138:8080/rc/image/teacher/teacher_2.jpg',2,'2019-05-29','1','<p class=\"zj-title\" style=\"font-family:&quot;font-size:15px;color:#666666;\">\r\n	<strong><span style=\"color:#008C3E;\">一、个人简况</span></strong> \r\n</p>\r\n<p class=\"zj-content\" style=\"font-family:&quot;font-size:15px;color:#444444;background-color:#FFFFFF;\">\r\n	邓洪昌，男，1986年5月生，桂林电子科技大学电子工程与自动化学院副教授。近五年来，主持国家自然基金面上项目1项，博士后基金项目3项，国家重点研发计划重点专项子课题1项；作为研究骨干，参加国家自然基金重点项目2项、面上项目1项。发表学术论文18篇，以第一作者发表被SCI收录的学术论文7篇，其中JCR 1区论文6篇，2区论文1篇。申请及获得授权的国家发明技术专利12项，排名第二（导师排名第一），其中获得授权专利6项，公开并进入实质性审查的发明技术专利6项。\r\n</p>\r\n<p class=\"zj-title\" style=\"font-family:&quot;font-size:15px;color:#666666;\">\r\n	<strong><span style=\"color:#008C3E;\">二、教育背景</span></strong> \r\n</p>\r\n<p class=\"zj-content\" style=\"font-family:&quot;font-size:15px;color:#444444;background-color:#FFFFFF;\">\r\n	2008年－2014年，哈尔滨工程大学，理学院，机械设计及理论专业，获得工学博士学位；<br />\r\n2004年－2008年，哈尔滨工程大学，理学院，电子科学与技术专业，获得工学学士学位；\r\n</p>\r\n<p class=\"zj-title\" style=\"font-family:&quot;font-size:15px;color:#666666;\">\r\n	<strong><span style=\"color:#008C3E;\">三、工作经历</span></strong> \r\n</p>\r\n<p class=\"zj-content\" style=\"font-family:&quot;font-size:15px;color:#444444;background-color:#FFFFFF;\">\r\n	2017年－至今，桂林电子科技大学，电子工程与自动化学院，副教授；<br />\r\n2015年－2017年，哈尔滨工程大学，理学院，光学工程博士后；\r\n</p>\r\n<p class=\"zj-title\" style=\"font-family:&quot;font-size:15px;color:#666666;\">\r\n	<strong><span style=\"color:#008C3E;\">四、科研项目</span></strong> \r\n</p>\r\n<p class=\"zj-content\" style=\"font-family:&quot;font-size:15px;color:#444444;background-color:#FFFFFF;\">\r\n	1.基于同轴双波导光纤马达研究（61675052），国家自然科学基金面上项目，主持；<br />\r\n2.螺旋芯光纤SPR传感器研究（61705050），国家自然科学基金青年科学基金项目，主持；<br />\r\n3、二维阵列芯艾里光纤的特性研究（2015M581428），中国博士后科学基金资助，主持；<br />\r\n4.微结构光纤制备与新型器件集成研究（LBH-Z15039），黑龙江省博士后资助，主持；<br />\r\n5.三角芯涡旋场光纤及其特性研究（LBH-TZ1605），黑龙江省博士后特别资助，主持；<br />\r\n6.传感光纤材料与器件国家重点研发计划重点专项子课题（2017YFB0405501），子任务负责人；&nbsp;<br />\r\n7.面向微流传感的光子带隙光纤关键技术及器件（6163500），国家自然基金重点项目，项目骨干；<br />\r\n8.微结构光纤制备与新型器件集成研究（61535004），国家自然基金重点项目，项目骨干；<br />\r\n9.Airy光纤及其光学特性研究（11274077），国家自然基金面上项目，项目骨干。\r\n</p>\r\n<p style=\"font-family:&quot;font-size:15px;color:#666666;\">\r\n	<strong><span style=\"color:#008C3E;\">五、发表学术论文</span></strong> \r\n</p>\r\n<p class=\"zj-content\" style=\"font-family:&quot;font-size:15px;color:#444444;background-color:#FFFFFF;\">\r\n	[1] Deng Hongchang, Zhang Yaxun, Yuan Tinging, Zhang Xiaotong, Zhang Yu, Liu Zhihai, and Yuan Libo*. Fiber based optical gun for particle shooting. ACS Photonics, 2017, 4(3): 642–648.<br />\r\n[2] Deng Hongchang, Yuan Yonggui, and Yuan Libo*. Design, transform and control of optical field in discrete optical system: an example. Scientific Reports, 2017, 7: 5171.<br />\r\n[3] Deng Hongchang, Yuan Libo. Annular arrayed-waveguide fiber for autofocusing Airy-like beams. Optics Letters, 2016, 41(4): 824-827.&nbsp;<br />\r\n[4] Deng Hongchang, Qi Cheng, Zhang Xiaotong, Yuan Libo. Highly focused conical optical field for Pico-Newton scale force sensing. Journal of Lightwave Technology, 2015, 33(12): 2486-2491.&nbsp;\r\n</p>\r\n<p class=\"zj-title\" style=\"font-family:&quot;font-size:15px;color:#666666;\">\r\n	<strong><span style=\"color:#008C3E;\">六、国家发明技术专利</span></strong> \r\n</p>\r\n<p class=\"zj-content\" style=\"font-family:&quot;font-size:15px;color:#444444;background-color:#FFFFFF;\">\r\n	[1] 苑立波, 邓洪昌, 张羽. 基于螺旋锥体表面芯光纤的微小粒子旋进推动装置及方法: CN102147500.&nbsp;<br />\r\n[2] 苑立波, 邓洪昌, 杨军. 沿侧面抛磨开槽方向运动的光纤微小粒子定向驱动器及方法: CN102147501.<br />\r\n[3] 苑立波, 邓洪昌, 田凤军等. 基于中空融嵌芯毛细管光纤的微小粒子运送装置及方法: CN102147502.<br />\r\n[4] 苑立波, 邓洪昌, 关春颖. 表面芯光纤微小粒子输运器及微小粒子输运方法: CN102147503.\r\n</p>'),(5,'邓仕杰','电子工程与自动化学院','副教授','博士、硕士生导师','sdeng_guet@163.com','主要从事单光子探测技术及相关集成电路设计，光电探测及传感系统研究','http://119.23.49.138:8080/rc/image/teacher/ylbteacher.jpg',3,'2019-05-29','1','<p class=\"zj-title\" style=\"font-family:&quot;font-size:15px;color:#666666;\">\r\n	<strong><span style=\"color:#008C3E;\">一、个人简况</span></strong> \r\n</p>\r\n<p class=\"zj-content\" style=\"font-family:&quot;font-size:15px;color:#444444;background-color:#FFFFFF;\">\r\n	邓仕杰，副教授，博士，硕士生导师。（sdeng_guet@163.com） 2014年博士华业于爱尔兰国立科克大学(University CollegeCon)电气与电子工程专业，2013-2018年于爱尔兰科克理工学院(Cork lnsiute of Technology) 进I行博士后研究。主要从事单光子探测技术及相关集成电路设计，光电探测及传感系统研究。近年来，主持爱尔兰企业局项目4项，省部级项目1项，参与多项爱尔兰科学基金以及欧盟企业合作项目，第一作者在国际期刊及会议发表学术论文15篇，申请国际PCT专利1项，国家发明专利3项。\r\n</p>\r\n<p class=\"zj-title\" style=\"font-family:&quot;font-size:15px;color:#666666;\">\r\n	<strong><span style=\"color:#008C3E;\">二、教育背景</span></strong> \r\n</p>\r\n<p class=\"zj-content\" style=\"font-family:&quot;font-size:15px;color:#444444;background-color:#FFFFFF;\">\r\n	1、2009/10 – 2013/8， 爱尔兰国立科克大学，电气与电子工程系，博士，导师：Dr. Alan Morrison/<br />\r\n2、2008/9 - 2009/9， 爱尔兰国立科克大学， 电气与电子工程系， 硕士<br />\r\n3、1980年－1984年，黑龙江大学，物理系，获得理学学士学位\r\n</p>\r\n<p class=\"zj-title\" style=\"font-family:&quot;font-size:15px;color:#666666;\">\r\n	<strong><span style=\"color:#008C3E;\">三、工作经验</span></strong> \r\n</p>\r\n<p class=\"zj-content\" style=\"font-family:&quot;font-size:15px;color:#444444;background-color:#FFFFFF;\">\r\n	1、2018/1-至今，桂林电子科技大学，电子工程与自动化学院，专任教师<br />\r\n2、2013/8-2018/1，爱尔兰科克理工学院，Tyndall National Institute,CAPPA centre，Photonics Researcher（博士后）\r\n</p>\r\n<p class=\"zj-title\" style=\"font-family:&quot;font-size:15px;color:#666666;\">\r\n	<strong><span style=\"color:#008C3E;\">四、科研项目</span></strong> \r\n</p>\r\n<p class=\"zj-content\" style=\"font-family:&quot;font-size:15px;color:#444444;background-color:#FFFFFF;\">\r\n	广西科技基地和人才专项，“单光子探测技术研究-创新创业青年人才培养示范”，2019-2021, 主持；<br />\r\n广西自动检测技术与仪器重点实验室基金，“基于Geiger-Mode APD的单光子探测器设计和研究”，2018-2020, 主持；<br />\r\n广西光电信息处理重点实验室基金，“单光子探测芯片及其智能光电探测系统研发”，2018-2019, 主持；<br />\r\n爱尔兰企业局 (Enterprise Ireland)项目: CF20170681P，“Single photon counting module with inter-changeable detector and intelligent control logic”. 时间：2017/07–2018/07，金额：8.86万欧元，主持；<br />\r\n爱尔兰企业局 (Enterprise Ireland)项目: CF20150288Y，“Single photon counting module with swappable detector and precise optimisation of the dead-time”. 时间：2015/10–2016/3，金额： 1.42万欧元，主持；<br />\r\n爱尔兰企业局 (Enterprise Ireland)项目: IP20160487Y，“Active quench and reset integrated circuit (AQR-IC) for single photon avalanche diode (SPAD)”. 时间：2016/10–2017/4，金额：0.9万欧元，主持；<br />\r\n爱尔兰企业局 (Enterprise Ireland)项目: CF20160497Y，“Low-cost portable miniaturized pH monitor”. 时间：2016/11 – 2017/5，金额：1.49万欧元，主持。\r\n</p>\r\n<p style=\"font-family:&quot;font-size:15px;color:#666666;\">\r\n	<strong><span style=\"color:#008C3E;\">五、主要论文</span></strong> \r\n</p>\r\n<p class=\"zj-content\" style=\"font-family:&quot;font-size:15px;color:#444444;background-color:#FFFFFF;\">\r\n	[1]Shijie Deng and Alan P. Morrison, \"Real-time dark count compensation and temperature monitoring using dual SPADs on the same chip\", Electronics Letters, 54(10), pp. 642-643, 2018.<br />\r\n[2]Shijie Deng, Declan Gordon, and Alan P. Morrison, \"A Geiger-Mode APD Photon Counting System With Adjustable Dead-Time and Interchangeable Detector\", IEEE Photonics Technology Letters, 28 (1), 99–102, 2016.<br />\r\n[3]Shijie Deng, William Doherty, Michael AP McAuliffe, Urszula Salaj-Kosla, Liam Lewis and Guillaume Huyet, \"A low-cost, portable optical sensing system with wireless communication compatible of real-time and remote detection of dissolved ammonia\", Photonic Sensors, 6 (2), 107-114, 2016.<br />\r\n[4]Shijie Deng and Alan P. Morrison, \"Active quench and reset integrated circuit with novel hold-off time control logic for Geiger-mode avalanche photodiodes\", Optics Letters, 37 (18), 3876-3878, Sep. 2012.<br />\r\n[5]S. Deng and A. P. Morrison, \"Integrable bias solution for avalanche photodiodes\", Electronics Letters, 47 (4), 240-241, Feb. 2011\r\n</p>'),(6,'杨宏艳','电子工程与自动化学院','博士，硕士生导师','副研究员','yhy.gl@126.com','主要从事表面等离子体(SPPs)微纳光电子功能器件和光纤传感方面的研究','http://119.23.49.138:8080/rc/image/teacher/stu1.jpg',4,'2019-05-29','1','<p class=\"zj-title\" style=\"font-family:&quot;font-size:15px;color:#666666;\">\r\n	<strong><span style=\"color:#008C3E;\">一、个人简况</span></strong> \r\n</p>\r\n<p class=\"zj-content\" style=\"font-family:&quot;font-size:15px;color:#444444;background-color:#FFFFFF;\">\r\n	副研究员，博士，硕士生导师。(yhy.gl@126.com） 2017年博士毕业于澳门科技大学电子资讯科技专业主要从事表面等离子体(SPPs)微纳光电子功能器件和光纤传感方面的研究，近年来主持国家自然科学地区基金项月一项，主待省邮级项目一项，广西自动除利技术与仪器重点实验室茶金项自一项。在《IEE Photonies Technology latters》AIP Advances哥国际学术期刊发表学术论文12篇。\r\n</p>\r\n<p class=\"zj-title\" style=\"font-family:&quot;font-size:15px;color:#666666;\">\r\n	<strong><span style=\"color:#008C3E;\">二、教育背景</span></strong> \r\n</p>\r\n<p class=\"zj-content\" style=\"font-family:&quot;font-size:15px;color:#444444;background-color:#FFFFFF;\">\r\n	2013.09-2017.07，博士，澳门科技大学资讯科技学院，电子资讯科技专业，导师：李建庆<br />\r\n2001.09-2004.07，硕士，广西师范大学物理与信息工程学院，物理教学论，导师：罗星凯<br />\r\n1990.09-1994.07，本科，广西师范学院物理系，物理教育，系主任：池方涵\r\n</p>\r\n<p class=\"zj-title\" style=\"font-family:&quot;font-size:15px;color:#666666;\">\r\n	<strong><span style=\"color:#008C3E;\">三、工作经验</span></strong> \r\n</p>\r\n<p class=\"zj-content\" style=\"font-family:&quot;font-size:15px;color:#444444;background-color:#FFFFFF;\">\r\n	1994.09-2001.07 桂林理光（北京）公司，技术主管；<br />\r\n2004.09-2017.10 桂林电子科技大学计算机与信息安全学院，讲师；<br />\r\n2017.10-至今，桂林电子科技大学电子工程与自动化学院，副研究员。\r\n</p>\r\n<p class=\"zj-title\" style=\"font-family:&quot;font-size:15px;color:#666666;\">\r\n	<strong><span style=\"color:#008C3E;\">四、主要荣誉</span></strong> \r\n</p>\r\n<p class=\"zj-content\" style=\"font-family:&quot;font-size:15px;color:#444444;background-color:#FFFFFF;\">\r\n	2016年 澳门科学技术发展基金会颁发的年度研究生科技研发奖\r\n</p>\r\n<p style=\"font-family:&quot;font-size:15px;color:#666666;\">\r\n	<strong><span style=\"color:#008C3E;\">五、学术活动</span></strong> \r\n</p>\r\n<p class=\"zj-content\" style=\"font-family:&quot;font-size:15px;color:#444444;background-color:#FFFFFF;\">\r\n	2018年5月，日本参加APOS2018(亚太光学传感)国际会议；<br />\r\n2017年 4月28-30日，在大连參加了2017等離子體與微納光子學國際研討會（ISPN2017）。大會邀請了美國斯坦福大學的Mark Brongersma教授，美國哈佛大學的Federico Capasso教授，中國北京大學的龔旗煌院士，美國萊斯大學的Peter Nordlander教授和Naomi Halas等知名教授介紹等離子體光學和納米光學的最新進展；<br />\r\n2015年11月10-14日，參加在泰國曼谷主辦的EMN Bangkok Meeting 2015 on Materials大會；<br />\r\n2015年7月13日-7月24日，参加了北京大学区域光纤重点实验室周治平教授主办的2015年“硅基光电子技术及应用”暑期学校；<br />\r\n2007.9-2008.07 华东师范大学 信息教育学院 访问学者，合作导师：张际平&nbsp;\r\n</p>\r\n<p class=\"zj-title\" style=\"font-family:&quot;font-size:15px;color:#666666;\">\r\n	<strong><span style=\"color:#008C3E;\">六、主要论文</span></strong> \r\n</p>\r\n<p class=\"zj-content\" style=\"font-family:&quot;font-size:15px;color:#444444;background-color:#FFFFFF;\">\r\n	[1] Yang H, Li J, Xiao G. Decay and propagation properties of symmetric surface plasmon polariton mode in metal–insulator–metal waveguide[J]. Optics Communications 395 (2017) 159–162. (SCI收录）<br />\r\n[2] Yang H, Li J, Xiao G. Significantly increased surface plasmon polariton mode excitation using a multilayer insulation structure in a metal–insulator–metal plasmonic waveguide[J]. Applied optics, 2014, 53(17): 3642-3646.(SCI收录）<br />\r\n[3] Yang H, Li J, Xiao G. A highly efficient surface plasmon polaritons excitation achieved with a metal-coupled metal-insulator-metal waveguide [J]. AIP Advances, 2014, 4(12): 127114. (SCI收录）<br />\r\n[4] Hong-Yan Y, Yan-Ru Z, Gong-Li X, et al. Enhanced Light Narrow Transmission through Cascaded Metallic Structure with Periodic Aperture Arrays [J]. Chinese Physics Letters, 2012, 29(10): 107303.(SCI收录）<br />\r\n[5] 杨宏艳,肖功利*. 折射率对金属-电介质-金属光子晶体强透射特性的影响[J]. 光学学报. 2012, 32，7: 0716002. (EI收录)<br />\r\n[6] 杨宏艳, 肖功利. 金孔阵列-电介质与金-电介质孔阵列的强透射特性[J]. 光学学报, 2012, 32(11): 312-316. (EI收录[7] 杨宏艳, 夏雪, 覃裕初,等. 基于新一代 GPS 的垂直度误差评定方法的研究[J]. 传感器与微系统, 2012, 31(5): 44-47.<br />\r\n[8] Gongli X, Hongyan Y. Significantly enhanced transmission achieved with double-layered metallic aperture arrays with sub-skin-depth Ag film [J]. Journal of Semiconductors, 2012, 33(12): 122001. (EI收录)<br />\r\n[9]Gongli X, Hongyan Y. The effect of array periodicity on the filtering characteristics of metal/dielectric photonic crystals [J]. Journal of Semiconductors, 2011, 32(4): 044004. (EI收录)<br />\r\n[10] Yang H, Zhong Y. Extracting Algorithm of Characteristics Data Based STEP in Rapid Prototyping Technology[C]//Genetic and Evolutionary Computing, 2009. WGEC\'09. 3rd International Conference on. IEEE, 2009: 374-377.(EI收录)<br />\r\n[11] Xiao G, Li J, Yang H. Enhanced Light Emission of Er (Yb/Y) Silicates at the Wavelength of 1.53μm With Au Plasmonic Arrays[J]. IEEE Photonics Journal, 2017, 9(1):pp.1-9. (SCI收录)<br />\r\n[12]肖功利, 刘小刚, 杨宏艳, 等. 基于金属圆弧孔阵列强透射的折射率传感特性[J]. 光学学报, 2018, 38(2): 0224001.(EI收录)<br />\r\n[13] 肖功利, 刘利, 杨宏艳, 等. 基于微腔耦合结构金属弯曲波导的光透射特性[J]. 光学学报, 2017, 37(12): 1213001.(EI收录)<br />\r\n[14] 肖功利, 郑龙, 王宏庆, 杨宏艳,等. 内嵌镜像对称矩形腔楔形金属狭缝阵列的宽带增强透射[J]. 半导体光电, 2016 37(4):pp.505-509.<br />\r\n[15] 肖功利，郑龙，王宏庆，杨宏艳，韦力丹等. 内置金属/电介质同心圆柱的金属孔阵列结构强透射特性[J].半导体光电, 2016, 37(6):pp.779-795.<br />\r\n[16] 韦力丹, 王宏庆, 杨宏艳, 肖功利*等. 内嵌金属块的金属-绝缘体-金属波导光透射特性[J]. 激光与光电子学进展, 2016, 53(9):pp. 217-223.<br />\r\n[17] 岳宏卫, 邓进丽, 朱智勇, 杨宏艳, 肖功利*等. 纳米狭缝耦合金属圆-矩形复合孔阵列结构增强光透射[J]. 光电工程, 2016, 43(8):pp.7-12.<br />\r\n[18] 肖功利, 杨宏艳. 几何横向比例对金属孔阵列强透射特性的影响[J].半导体光电, 2011, 32(2):pp.220-223.<br />\r\n[19] 肖功利, 杨宏艳. 掺锑二氧化锡薄膜的喷雾热解法制备与热处理[J]. 半导体光电, 2008, 29(3): 357-360. (EI收录)&nbsp;\r\n</p>\r\n<p class=\"zj-title\" style=\"font-family:&quot;font-size:15px;color:#666666;\">\r\n	<strong><span style=\"color:#008C3E;\">七、科研项目</span></strong> \r\n</p>\r\n<p class=\"zj-content\" style=\"font-family:&quot;font-size:15px;color:#444444;background-color:#FFFFFF;\">\r\n	主持项目<br />\r\n1．国家自然科学基金地区科学基金项目：无标记实时生物检测的等离子光纤端面折射率传感器研究(No. 61765004)，43万，国家自然科学基金委员会，项目主持。<br />\r\n2. 广西自然科学基金面上项目：金属孔阵列/电介质/金属结构等离子体MEMS红外光源机理与关键技术研究（No. 2016GXNSFAA380006）, 5万，广西科技厅；项目主持。<br />\r\n3. 广西自动检测技术与仪器重点实验室主任项目：二维先进材料中红外等离子生物传感器研究（No. YQ18110）, 3万，广西科技厅；项目主持。<br />\r\n参与项目<br />\r\n1. 澳门科技大学合作项目：表面等离激元与光纤集成传感器的研究(No. 037/2015/A1)，澳门科技发展基金；93万MOP, 项目参与。<br />\r\n2.澳门科技发展基金项目：嵌入式全光纤传感器的工作机理与应用研究（082/2012/A3），澳门科技发展基金，项目结题，参与。<br />\r\n3. 国家自然科学基金地区科学基金项目：基于耦合金属/电介质/金属纳米结构高激发效率电致表面等离子体激元源器件研究(No.61465004)，48万，国家自然科学基金委员会，项目参与，排名第四。<br />\r\n4. 广西高校科学技术研究项目重点项目：高性能低成本基于金属/电介质/金属纳米结构电致表面等离子激元源器件研究(No.2013ZD026) ，12万，广西教育厅；项目参与，排名第四。<br />\r\n5.合作项目：表面等离激元与光纤集成传感器制作及性能研究, 6万 桂林电子科技大学；项目主持。&nbsp;\r\n</p>\r\n<p class=\"zj-title\" style=\"font-family:&quot;font-size:15px;color:#666666;\">\r\n	<strong><span style=\"color:#008C3E;\">七、知识产权</span></strong> \r\n</p>\r\n<p class=\"zj-content\" style=\"font-family:&quot;font-size:15px;color:#444444;background-color:#FFFFFF;\">\r\n	1. 杨宏艳等,一种光纤端面电介质-金属圆孔阵列结构的折射率传感器, 国家发明专利申请 (申请号：CN201810336559.X)；&nbsp;<br />\r\n2. 杨宏艳等,一种基于MIM波导的耦合腔结构的多透射等离子体滤波器(申请号：CN201810429510.9)；&nbsp;<br />\r\n3. 杨宏艳等,一种基于MIM波导的内嵌矩形腔等离子体滤波器(申请号：CN201810436628.4，公开号CN108493527A实质审查)；&nbsp;<br />\r\n4. 杨宏艳等,一种基于布拉格光纤端面金孔阵列结构的折射率传感器(申请号：CN201810336557.0)；<br />\r\n5. 杨宏艳等,一种圆形-矩形复合纳米孔阵列表面等离激元光纤传感器(申请号：CN201811039272.7)；\r\n</p>'),(7,'滕传新','电子工程与自动化学院','讲师','工学博士，硕士生导师','xinchuanteng@126.com','主要从事光纤传感技术方面的研究','http://119.23.49.138:8080/rc/image/teacher/teacher_1.jpg',5,'2019-05-29','1','<p class=\"zj-title\" style=\"font-family:&quot;font-size:15px;color:#666666;\">\r\n	<strong><span style=\"color:#008C3E;\">一、个人简况</span></strong> \r\n</p>\r\n<p class=\"zj-content\" style=\"font-family:&quot;font-size:15px;color:#444444;background-color:#FFFFFF;\">\r\n	滕传新，男，1985年4月生人，工学博士，硕士生导师。（xinchuanteng@126.com） 博士毕业于吉林大学电子科学与工程学院物理电子学专业。主要从事光纤传感技术方面的研究。目前，主持国家自然科学基金青年项目1项，广西区自然科学基金和广西科技基地人才项目各1项。发表SCI收录文章10余篇、EI收录文章10余篇，申请发明专利6项。\r\n</p>\r\n<p class=\"zj-title\" style=\"font-family:&quot;font-size:15px;color:#666666;\">\r\n	<strong><span style=\"color:#008C3E;\">二、教育背景</span></strong> \r\n</p>\r\n<p class=\"zj-content\" style=\"font-family:&quot;font-size:15px;color:#444444;background-color:#FFFFFF;\">\r\n	2004.9-2008.7 吉林大学·电子科学与工程学院 电子信息工程专业<br />\r\n2010.9-2013.7 吉林大学·电子科学与工程学院 物理电子学专业<br />\r\n2014.9-2017.7 吉林大学·电子科学与工程学院 物理电子学专业\r\n</p>\r\n<p class=\"zj-title\" style=\"font-family:&quot;font-size:15px;color:#666666;\">\r\n	<strong><span style=\"color:#008C3E;\">三、工作经验</span></strong> \r\n</p>\r\n<p class=\"zj-content\" style=\"font-family:&quot;font-size:15px;color:#444444;background-color:#FFFFFF;\">\r\n	2008.7-2010.9, 中国人民解放军沈阳军区65571部队<br />\r\n2017.06-今，桂林电子科技大学，电子工程与自动化学院，讲师\r\n</p>\r\n<p class=\"zj-title\" style=\"font-family:&quot;font-size:15px;color:#666666;\">\r\n	<strong><span style=\"color:#008C3E;\">四、主要论文</span></strong> \r\n</p>\r\n<p class=\"zj-content\" style=\"font-family:&quot;font-size:15px;color:#444444;background-color:#FFFFFF;\">\r\n	[1] Chuanxin Teng et al, “Liquid Level Sensor Based on a V-Groove Structure Plastic Optical Fiber,” Sensors, 18(2018) 3111.<br />\r\n[2] Chuanxin Teng et al., “Investigation of a Plastic Optical Fiber Imprinted with a V-groove Structure for Displacement Sensing,” Optical engineering, 2018.<br />\r\n[3] Chuanxin Teng, Ning Jing, Fangda Yu, Yue Ding, and Jie Zheng, “Refractive index sensor based on a multi-notched plastic optical fiber,” Applied Optics, 56 (2017) 1833-1838.<br />\r\n[4] Chuanxin Teng, Fangda Yu, Ning Jing, Yue Ding, Zhenpeng Si, and Jie Zheng, “Investigation of refractive index sensors based on side-polished plastic optical fibers,” Optical Fiber Technology, 36 (2017) 1–5.<br />\r\n[5] Chuanxin Teng, Fangda Yu, Ning Jing and Jie Zheng, “The influence of temperature to a refractive index sensor based on a macro-bending tapered plastic optical fiber,” Optical Fiber Technology, 31(2016) 32-35.<br />\r\n[6] Chuanxin Teng, Ning Jing, Fangda Yu and Jie Zheng, “Investigation of a Macro-Bending Tapered Plastic Optical Fiber for Refractive Index Sensing,” IEEE Sensors Journal, 16 (2016) 7521-7525.<br />\r\n[7] Chuanxin Teng, Fangda Yu, Ning Jing and Jie Zheng, “Temperature effect on refractive index sensing performance of a U-shape tapered plastic optical fiber,” SPIE Photonics Asia 2016, Oral presentation.<br />\r\n<br />\r\n[8] Chuanxin Teng, Ning Jing, Zhenpeng Si, Zijian Min and Jie Zheng, “Study of Side-polished Plastic Optical Fibers for Refractive Index Sensing,” Asia Communications and Photonics Conference 2016, Poster presentation.<br />\r\n[9] Ning Jing, Chuanxin Teng, Fangda Yu, et al., “Temperature Dependence of a Refractive Index Sensor Based on Side-Polished Macrobending Plastic Optical Fiber,” IEEE Sensors Journal, 54(2015) 355-358.<br />\r\n[10] Ning Jing, Chuanxin Teng, Xiaowei Zhao et al., “Temperature Dependence of a Refractive Index Sensor based on a Macrobending Micro-Plastic Optical Fiber,” Applied Optics, 54(2015) 1890-1893.<br />\r\n[11] Ning Jing, Chuanxin Teng, Jie Zheng, Guanjun Wang, Minjuan Zhang and Zhibin Wang, “Temperature dependence of light power propagation in bending plastic optical fiber,” Optical Fiber Technology, 31(2016) 20-22.<br />\r\n[12] Ning Jing, Chuanxin Teng, Jie Zheng, Guanjun Wang, Yuanyuan Chen, and Zhibin Wang, “A Liquid Level Sensor based on a Race-Track Helical Plastic Optical Fiber,” IEEE Photonics technology letters, 29 (2016) 158-160.<br />\r\n[13] Ning Jing, Jie Zheng, Xiaowei Zhao and Chuanxin Teng, “Refractive Index Sensing Based on a Side-Polished Macrobending Plastic Optical Fiber,” IEEE Sensors Journal, 15(2015) 2898-2901.<br />\r\n[14] Ning Jing, Jie Zheng, Xiaowei Zhao and Chuanxin Teng, “Investigation of a macrobending micro-plastic optical fiber for refractive index sensing,” Applied Optics, 53(2014) 8145-50.<br />\r\n[15] Ning Jing, Chuanxin Teng, and Jie Zheng et al, “The Effects of Water Absorption and Temperature Dependency of the POF for Refractive Index sensing,” Asia Communications and Photonics Conference 2014.<br />\r\n[16] Yue Ding, Xiaowei Zhao, and Chuanxin Teng et al, “Effect of Annealing Process for Copper Ion-Exchanged Planar Waveguides in BK7 Glass,” Asia Communications and Photonics Conference 2016.<br />\r\n[17] Chuanxin Teng, Fangda Yu,Yue Ding, and Jie Zheng, “Refractive index sensor based on multi-mode plastic optical fiber with long period grating,” SPIE Optics+Optoelectronics 2017.\r\n</p>\r\n<p style=\"font-family:&quot;font-size:15px;color:#666666;\">\r\n	<strong><span style=\"color:#008C3E;\">五、科研项目</span></strong> \r\n</p>\r\n<p class=\"zj-content\" style=\"font-family:&quot;font-size:15px;color:#444444;background-color:#FFFFFF;\">\r\n	国家自然科学基金青年项目：塑料光纤微型SPR阵列传感特性研究；\r\n</p>'),(8,'刘厚权','电子工程与自动化学院','讲师','博士，硕士生导师','houquanliu@163.com','长期从事非线性光学、光角动量等方向的研究','http://119.23.49.138:8080/rc/image/teacher/dsjteacher.png',6,'2019-05-29','1','<p class=\"zj-title\" style=\"font-family:&quot;font-size:15px;color:#666666;\">\r\n	<strong><span style=\"color:#008C3E;\">一、个人简况</span></strong> \r\n</p>\r\n<p class=\"zj-content\" style=\"font-family:&quot;font-size:15px;color:#444444;background-color:#FFFFFF;\">\r\n	刘厚权，男，1990年3月生，讲师，博士，硕士生导师。(houquanliu@163.com) 2017年博士毕业于中山大学光学专业。长期从事非线性光学、光角动量等方向的研究，目前已发表学术论文8篇，申请发明专利4项。欢迎对科研有兴趣的同学报考本人的研究生。\r\n</p>\r\n<p class=\"zj-title\" style=\"font-family:&quot;font-size:15px;color:#666666;\">\r\n	<strong><span style=\"color:#008C3E;\">二、教育背景</span></strong> \r\n</p>\r\n<p class=\"zj-content\" style=\"font-family:&quot;font-size:15px;color:#444444;background-color:#FFFFFF;\">\r\n	2008/09-2012/06, 中山大学，光信息科学与技术专业，理学学士；<br />\r\n2012/09-2017/06, 中山大学，光学专业，理学博士（直博）。\r\n</p>\r\n<p class=\"zj-title\" style=\"font-family:&quot;font-size:15px;color:#666666;\">\r\n	<strong><span style=\"color:#008C3E;\">三、工作经验</span></strong> \r\n</p>\r\n<p class=\"zj-content\" style=\"font-family:&quot;font-size:15px;color:#444444;background-color:#FFFFFF;\">\r\n	2017/06-今，桂林电子科技大学，电子工程与自动化学院，讲师\r\n</p>\r\n<p class=\"zj-title\" style=\"font-family:&quot;font-size:15px;color:#666666;\">\r\n	<strong><span style=\"color:#008C3E;\">四、主要论文</span></strong> \r\n</p>\r\n<p class=\"zj-content\" style=\"font-family:&quot;font-size:15px;color:#444444;background-color:#FFFFFF;\">\r\n	1、Houquan Liu, Chuanxin Teng, Hongyan Yang, Hongchang Deng, Ronghui Xu, Shijie Deng, Li Zhang, Ming Chen, and Libo Yuan\"Difference frequency sideband generation in semiconductors.\" OSA Continuum 2.2 (2019): 244-252.<br />\r\n2、Chuanxin Teng, Shijie Deng, Hongchang Deng, Hongyan Yang, Yonghui Xu, Libo Yuan, Jie Zheng, Houquan Liu（通讯作者） \"Investigation of a plastic optical fiber imprinted with V-groove structure for displacement sensing.\" Optical Engineering 58.7 (2019): 072002.<br />\r\n3、Houquan Liu, Chuanxin Teng, Hongyan Yang, Hongchang Deng, Ronghui Xu, Shijie Deng, Ming Chen, and Libo Yuan \"Proposed phase plate for superimposed orbital angular momentum state generation.\" Optics express 26.11 (2018): 14792-14799.<br />\r\n4、Chuanxin Teng, Houquan Liu, Hongchang Deng, Shijie Deng, Hongyan Yang , Ronghui Xu, Ming Chen, Libo Yuan and Jie Zheng \"Liquid Level Sensor Based on a V-Groove Structure Plastic Optical Fiber.\" Sensors 18.9 (2018): 3111.<br />\r\n5、Houquan Liu and Xingchu Zhang. \"Theory of controlling band-width broadening in terahertz sideband generation in semiconductors by a direct current electric field.\" Optics Communications 387 (2017): 37-42.<br />\r\n6、Houquan Liu and Weilong She. \"Theory of effect of near-infrared laser polarization direction on high-order terahertz sideband generation in semiconductors.\" Optics Express 23.8 (2015): 10680-10686.<br />\r\n7、Houquan Liu. \"Optical spanner based on the transfer of spin angular momentum of light in semiconductors.\" Optics Communications 342 (2015): 125-128.<br />\r\n8、Houquan Liu and Weilong She. \"Influence of electrically induced refraction and absorption on the measurement of spin current by pockels effect in GaAs.\" Journal of Applied Physics 117.10 (2015): 105704.\r\n</p>\r\n<p style=\"font-family:&quot;font-size:15px;color:#666666;\">\r\n	<strong><span style=\"color:#008C3E;\">五、科研项目</span></strong> \r\n</p>\r\n<p class=\"zj-content\" style=\"font-family:&quot;font-size:15px;color:#444444;background-color:#FFFFFF;\">\r\n	广西高校中青年教师基础能力提升项目，“基于半导体极端非线性光学效应的光调制技术的理论研究”，2018-2019，主持\r\n</p>'),(9,'徐荣辉','电子工程与自动化学院','博士，讲师','硕士研究生导师','rhxu76@guet.edu.cn','通讯，光电技术','http://119.23.49.138:8080/rc/image/teacher/dhcteacher.jpg',7,'2019-05-29','1','<p style=\"font-size:16px;font-family:philosopher-regular, 微软雅黑, &quot;color:#444444;background-color:#FFFFFF;\">\r\n	<br />\r\n</p>\r\n<p class=\"zj-title\" style=\"font-family:&quot;font-size:15px;color:#666666;\">\r\n	<strong><span style=\"color:#008C3E;\">一、个人简况</span></strong> \r\n</p>\r\n<p class=\"zj-content\" style=\"font-family:&quot;font-size:15px;color:#444444;background-color:#FFFFFF;\">\r\n	徐荣辉，男，1975年12月生，博士，讲师，硕士研究生导师。(rhxu76@guet.edu.cn) 以第一作者发表学术论文6篇，其中SCI收录2篇，EI收录2篇。申请国家发明专利7项，授权3项。主持省部级科研项目2项，广西高校光电信息处理重点实验室主任基金项目1项，参与国家级及省部级科研项目多项。\r\n</p>\r\n<p class=\"zj-title\" style=\"font-family:&quot;font-size:15px;color:#666666;\">\r\n	<strong><span style=\"color:#008C3E;\">二、教育背景</span></strong> \r\n</p>\r\n<p class=\"zj-content\" style=\"font-family:&quot;font-size:15px;color:#444444;background-color:#FFFFFF;\">\r\n	2012年9月-2015年9月， 南京大学 ，电子科学与技术博士<br />\r\n2004年9月-2007年6月，江西师范大学，光学硕士（2005年9月-2007年4月，于上海交通大学陈险峰教授实验室交流学习）<br />\r\n1994年9月-1998年6月， 江西师范大学，通讯工程学士\r\n</p>\r\n<p class=\"zj-title\" style=\"font-family:&quot;font-size:15px;color:#666666;\">\r\n	<strong><span style=\"color:#008C3E;\">三、工作经验</span></strong> \r\n</p>\r\n<p class=\"zj-content\" style=\"font-family:&quot;font-size:15px;color:#444444;background-color:#FFFFFF;\">\r\n	2017年7月-至今，桂林电子科技大学 电子工程与自动化学院<br />\r\n2015年9月-2017年7月，南昌工程学院 信息工程学院<br />\r\n2007年8月-2012年8月，江西蓝天/科技学院 信息工程学院<br />\r\n1998年7月-2004年8月，江西洪都航空工业集团公司 飞机设计研究所\r\n</p>\r\n<p>\r\n	<br />\r\n</p>'),(10,'于凌尧','电子工程与自动化学院','博士','副研究员','123456789@163.com','生物物理学和生物光子学','http://119.23.49.138:8080/rc/image/teacher/dhcteacher.jpg',8,'2019-05-29','1','<p class=\"zj-title\" style=\"font-family:&quot;font-size:15px;color:#666666;\">\r\n	<strong><span style=\"color:#008C3E;\">一、个人简况</span></strong> \r\n</p>\r\n<p class=\"zj-content\" style=\"font-family:&quot;font-size:15px;color:#444444;background-color:#FFFFFF;\">\r\n	副研究员，博士<br />\r\n研究方向为生物物理学和生物光子学，主要开展激光与细胞相互作用的光学力学以及蛋白质分子自体荧光光谱学的研究。共发表论文16篇，其中SCI收录9篇，参加国际会议9次(口头报告6次)，承担市级科技项目1项，参与国际、国家、省、市级项目5项，美国光学学会(OSA)会员，国际光学工程学会(SPIE) 会员。\r\n</p>\r\n<p class=\"zj-title\" style=\"font-family:&quot;font-size:15px;color:#666666;\">\r\n	<strong><span style=\"color:#008C3E;\">二、教育背景</span></strong> \r\n</p>\r\n<p class=\"zj-content\" style=\"font-family:&quot;font-size:15px;color:#444444;background-color:#FFFFFF;\">\r\n	2007年,江南大学,光信息科学与技术,学士<br />\r\n2010年, 深圳大学物理电子学,硕士<br />\r\n2016年3月,加拿大拉瓦尔大学物理学,博士<br />\r\n2016年4月-2017年5月年于加拿大拉瓦尔大学从事博士后研究工作。\r\n</p>'),(11,'尹君','电子工程与自动化学院','博士，副教授','研究员','123456789@qq.com','主要从事生物光子学、光谱学及非线性光学方法和技术方面的研究','http://119.23.49.138:8080/rc/image/teacher/teacher1.jpg',9,'2019-05-29','1','<p class=\"zj-title\" style=\"font-family:&quot;font-size:15px;color:#666666;\">\r\n	<strong><span style=\"color:#008C3E;\">一、个人简况</span></strong> \r\n</p>\r\n<p class=\"zj-content\" style=\"font-family:&quot;font-size:15px;color:#444444;background-color:#FFFFFF;\">\r\n	博士，副教授<br />\r\n2010年7月， 毕业于华中科技大学，获光学工程博士学位。主要从事生物光子学、光谱学及非线性光学方法和技术方面的研究。近年来，作为项目负责人或主要参与者主持和参加国家绒、省部级和市级项目项，发表学术论文18站，其CI政11篇，设专利项。\r\n</p>\r\n<p class=\"zj-title\" style=\"font-family:&quot;font-size:15px;color:#666666;\">\r\n	<strong><span style=\"color:#008C3E;\">二、教育背景</span></strong> \r\n</p>\r\n<p class=\"zj-content\" style=\"font-family:&quot;font-size:15px;color:#444444;background-color:#FFFFFF;\">\r\n	2010年7月， 毕业于华中科技大学，获光学工程博士学位\r\n</p>'),(12,'成煜','电子工程与自动化学院','博士','研究员','chengyu@guet.edu.cn','电子科学技术','http://119.23.49.138:8080/rc/image/teacher/dsjteacher.png',10,'2019-05-29','1','<p class=\"zj-title\" style=\"font-family:&quot;font-size:15px;color:#666666;\">\r\n	<strong><span style=\"color:#008C3E;\">一、个人简况</span></strong> \r\n</p>\r\n<p class=\"zj-content\" style=\"font-family:&quot;font-size:15px;color:#444444;background-color:#FFFFFF;\">\r\n	1974年11月出生，武汉理工大学博士（chengyu@guet.edu.cn)，英国南安普顿大学和英国巴斯大学博士后， 2012年武汉市东湖高新技术产业开发区“3551人才”，2017年江苏省“双创人才”，中国通信学会会员。\r\n</p>\r\n<p class=\"zj-title\" style=\"font-family:&quot;font-size:15px;color:#666666;\">\r\n	<strong><span style=\"color:#008C3E;\">二、教育背景</span></strong> \r\n</p>\r\n<p class=\"zj-content\" style=\"font-family:&quot;font-size:15px;color:#444444;background-color:#FFFFFF;\">\r\n	2004-03~2006-12 ,武汉理工大学,博士<br />\r\n1998-09~2001-07, 武汉理工大学 ,硕士<br />\r\n1992-09~1996-07,武汉工业大学 , 学士\r\n</p>\r\n<p class=\"zj-title\" style=\"font-family:&quot;font-size:15px;color:#666666;\">\r\n	<strong><span style=\"color:#008C3E;\">三、工作经验</span></strong> \r\n</p>\r\n<p class=\"zj-content\" style=\"font-family:&quot;font-size:15px;color:#444444;background-color:#FFFFFF;\">\r\n	1996-07,烟台华升玻璃钢有限公司,助理工程师 民营（私营）企业<br />\r\n2001-07,烽火通信科技股份有限公司 工程师 ,国有企业<br />\r\n2008-02, 英国南安普顿大学 ,研究员 ,世界排名第96位大学<br />\r\n2010-05,英国巴斯大学, 研究员, 世界排名第158位大学<br />\r\n2011-05，长飞光纤光缆股份有限公司， 主任工程师， 国有企业<br />\r\n2014-03，深圳市通盛新材料有限公司 技术总监， 中外合资企业（创始人）<br />\r\n2016-08 , 中天科技精密材料有限公司 研发总工程师 民营（私营）企业\r\n</p>\r\n<p class=\"zj-title\" style=\"font-family:&quot;font-size:15px;color:#666666;\">\r\n	<strong><span style=\"color:#008C3E;\">四、主要荣誉</span></strong> \r\n</p>\r\n<p class=\"zj-content\" style=\"font-family:&quot;font-size:15px;color:#444444;background-color:#FFFFFF;\">\r\n	2005-12-30 ，湖北省科技进步二等奖 ， 省级二等奖<br />\r\n2012-01-01 ，3551人才， 市级&nbsp;<br />\r\n2017-06-01，双创人才， 省级&nbsp;\r\n</p>\r\n<p class=\"zj-title\" style=\"font-family:&quot;font-size:15px;color:#666666;\">\r\n	<strong><span style=\"color:#008C3E;\">五、主要论文</span></strong> \r\n</p>\r\n<p class=\"zj-content\" style=\"font-family:&quot;font-size:15px;color:#444444;background-color:#FFFFFF;\">\r\n	1、 Zhao, Zhiyong; Tang, Ming; Fu, Songnian; Liu, Shuang; Wei, Huifeng; Cheng, Yu; Tong, Weijun; Shum, Perry Ping; Liu, Deming, All-solid multi-core fiber-based multipath Mach-Zehnder interferometer for temperature sensing, Applied Physics B, 2013， Volume 112, Issue 4, pp.491-497<br />\r\n2、CHENG Yu, Research on photodarkening in rare earth doped fibers, Journal of rare earths, Vol. 30, No. 11, Nov. 2012, P. 1102<br />\r\n3、 H. Heckl, C. J. Saraceno, C. R. E. Baer, T. Südmeyer, Y. Y. Wang, Y. Cheng, F. Benabid, and U. Keller, \"Temporal pulse compression in a xenon-filled Kagome-type hollow-core photonic crystal fiber at high average power,\" Opt. Express 19, 19142-19149 (2011) http://www.opticsinfobase.org/abstract.cfm?URI=oe-19-20-19142<br />\r\n4、Yu Cheng, Qingrong Han, Jean-Noel Maran， Bend-optimized optical fiber with S+C+L bands for FTTH applications， Optics Communications, 281 (2008) 5775–5778.<br />\r\n5、 Jihong zhang, haizheng tao, yu cheng, xiujian zhao， Structure, Upconversion and Fluorescence Properties of Er3+-doped TeO2-TiO2-La2O3 Tellurite Glass, Journal of rare earths, 25 (2007) PP108<br />\r\n6、Yu Cheng, xiujian zhao，The G.656 optical fiber waveguide design, J. Wuhan Univ. of Tech.-Mater. Sci. Ed., 2006.12 No.4\r\n</p>');

/*Table structure for table `user` */

DROP TABLE IF EXISTS `user`;

CREATE TABLE `user` (
  `user_id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '用户id',
  `username` varchar(30) DEFAULT NULL COMMENT '用户名',
  `password` varchar(30) DEFAULT NULL COMMENT '密码',
  `user_type` varchar(30) DEFAULT NULL COMMENT '用户类型',
  `add_time` date DEFAULT NULL COMMENT '加入时间',
  `last_login` datetime DEFAULT NULL COMMENT '上一次登录',
  `login_time` datetime DEFAULT NULL COMMENT '本次登录时间',
  `login_count` int(11) DEFAULT NULL COMMENT '登录次数',
  PRIMARY KEY (`user_id`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8;

/*Data for the table `user` */

insert  into `user`(`user_id`,`username`,`password`,`user_type`,`add_time`,`last_login`,`login_time`,`login_count`) values (1,'zhangsan','123','super','2019-03-15','2019-12-04 22:18:59','2019-12-04 22:18:59',165),(5,'hbmya','123456','normal','2019-05-28','2019-05-29 08:59:52','2019-05-29 08:59:52',2),(6,'haha','123','normal','2019-05-28','2019-05-28 22:03:47','2019-05-28 22:03:47',2);

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
