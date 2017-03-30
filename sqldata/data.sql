/*
SQLyog Ultimate v12.09 (64 bit)
MySQL - 5.7.10 : Database - taoschool
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`taoschool` /*!40100 DEFAULT CHARACTER SET utf8 */;

USE `taoschool`;

/*Table structure for table `orders` */

DROP TABLE IF EXISTS `orders`;

CREATE TABLE `orders` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '订单表id',
  `shop_id` int(11) DEFAULT NULL COMMENT '商品表id',
  `buyer_username` varchar(200) DEFAULT NULL COMMENT '买家名字',
  `seller_username` varchar(200) DEFAULT NULL COMMENT '卖家名字',
  `count` int(11) DEFAULT NULL COMMENT '数量',
  `time` time DEFAULT NULL COMMENT '时间',
  `state` int(11) DEFAULT '0' COMMENT '0:正常,1:拍下',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `orders` */

/*Table structure for table `publish` */

DROP TABLE IF EXISTS `publish`;

CREATE TABLE `publish` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '发布ID',
  `user_name` varchar(50) DEFAULT NULL COMMENT '用户Id',
  `shop_id` int(11) DEFAULT NULL COMMENT '商品Id',
  `time` time DEFAULT NULL COMMENT '发布时间',
  `likecount` int(11) DEFAULT NULL COMMENT '点赞数',
  `isreserve` int(11) DEFAULT '0' COMMENT '是否预定，0表示未预定',
  `ispay` int(11) DEFAULT '0' COMMENT '是否付款，0表示未付款',
  PRIMARY KEY (`id`),
  KEY `user_id` (`user_name`),
  KEY `shop_id` (`shop_id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

/*Data for the table `publish` */

insert  into `publish`(`id`,`user_name`,`shop_id`,`time`,`likecount`,`isreserve`,`ispay`) values (1,'1',1,'00:00:12',1213,0,0),(2,'1',2,'01:23:21',213,0,0);

/*Table structure for table `shop` */

DROP TABLE IF EXISTS `shop`;

CREATE TABLE `shop` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '商品id',
  `shopname` varchar(50) DEFAULT NULL COMMENT '商品名',
  `description` varchar(1020) DEFAULT NULL COMMENT '商品描述',
  `category` varchar(50) DEFAULT NULL COMMENT '商品分类',
  `picture` varchar(1024) DEFAULT NULL COMMENT '商品图片',
  `price` varchar(50) DEFAULT NULL COMMENT '商品价格',
  `username` varchar(50) DEFAULT NULL COMMENT '发布的用户姓名',
  `oldprice` varchar(50) DEFAULT NULL COMMENT '原先的价格',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=utf8;

/*Data for the table `shop` */

insert  into `shop`(`id`,`shopname`,`description`,`category`,`picture`,`price`,`username`,`oldprice`) values (1,'这是一个风景画','这是一个美丽的山峰','3213','/TaoSchool/img/1cc02a69-1f02-41f9-80f8-6afc112b383e.jpg','321','lovec',NULL),(2,'这是一个测试界面','321','321','/TaoSchool/img/77ab4abe-9139-4a7e-96f4-f618527fb388.png','321312','lovec',NULL),(3,'手机','好吃的','123','/TaoSchool/img/78dfec95e-c0be-40c6-adfa-5ff095186b67','123','lovec','456'),(4,'手机','幅度萨芬','1','/TaoSchool/img/77ab4abe-9139-4a7e-96f4-f618527fb388.png','123','lovec','12'),(5,'手机','幅度萨芬','1','/TaoSchool/img/1b96ee8e-9811-4085-a89b-12156819745b.png','123','lovec','12'),(6,'iphone6s 64G 黑色','刚买不久的Iphone6s 成色很新，希望新主人能够喜欢它','1','/TaoSchool/img/036a0b7e-ccf7-4442-afb3-fd4044b196bd.jpg','2455','lovec','3500'),(7,'27寸显示器AOC27寸','#台式及配件# 27寸显示器AOC27寸，无斑无点无线，一切正常，499元，显示器打包发货本来就很麻烦了，不接受讲价，少一毛不卖，运费不同地方不同收费，自提优先','1','/TaoSchool/img/ee204b81-b7e6-421d-b5fe-4f9668564686.jpg','499','lovec','998'),(9,'43寸4K显示器 +GTX1080 映众1871频率+罗技G910 G502 传说装备','GTX1080 +Z170+6700K+16G单条fury+酷冷至尊+256固态+3T硬盘台式机主机 所有游戏4K全特效畅开无阻 垂直同步稳定60帧 ，DOTA2 /WOW 130帧 ，搭配罗技顶级外设，让你体验飞一般的超神之旅','1','/TaoSchool/img/0fbd63a7-13d5-40b4-b268-67572a5294e7.jpg','1200','admin','1500');

/*Table structure for table `user` */

DROP TABLE IF EXISTS `user`;

CREATE TABLE `user` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '用户ID',
  `username` varchar(50) DEFAULT NULL COMMENT '用户账户',
  `password` varchar(50) DEFAULT NULL COMMENT '用户密码',
  `name` varchar(50) DEFAULT NULL COMMENT '用户姓名',
  `telephone` int(255) DEFAULT NULL COMMENT '用户电话',
  `college` varchar(50) DEFAULT NULL COMMENT '学院',
  `floor` varchar(50) DEFAULT NULL COMMENT '楼层',
  `dormitory` varchar(50) DEFAULT NULL COMMENT '宿舍号',
  `likecount` int(11) DEFAULT NULL COMMENT '被点赞数',
  `iconpath` varchar(1024) DEFAULT NULL COMMENT '用户头像',
  `earnhow` int(11) DEFAULT NULL COMMENT '赚去的钱',
  `publishcount` int(11) DEFAULT NULL COMMENT '发布统计',
  `inquirycount` int(11) DEFAULT NULL COMMENT '求购统计',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=47 DEFAULT CHARSET=utf8;

/*Data for the table `user` */

insert  into `user`(`id`,`username`,`password`,`name`,`telephone`,`college`,`floor`,`dormitory`,`likecount`,`iconpath`,`earnhow`,`publishcount`,`inquirycount`) values (1,'lovec','123','要去个美丽的地方',123,'理工学院','D栋','128',123,'/TaoSchool/img/258f7f50-0111-4744-8b1c-e8a07d9f35d8.png',NULL,NULL,NULL),(2,'admin','123','王田朝',1560692,'软件学院','D栋','128',123,NULL,600,NULL,NULL),(38,'Test','test','Test',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL),(39,'43153','542','532432',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL),(40,'51351','634','542',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL),(41,'Gfdshdfs','tgfds','321',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL),(42,'Wtc','123','123',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL),(43,'413431','513531','431431',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL),(44,'123','123','213',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL),(45,'1235','123','123',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL),(46,'1234','123','123',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL);

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
