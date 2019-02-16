-- MySQL dump 10.13  Distrib 5.7.19, for Win64 (x86_64)
--
-- Host: localhost    Database: rd_customerdam
-- ------------------------------------------------------
-- Server version	5.7.19-log

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `industry`
--

DROP TABLE IF EXISTS `industry`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `industry` (
  `id` int(11) NOT NULL,
  `name` varchar(50) NOT NULL,
  `parent` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `industry_parent_bc62832c_fk_industry_id` (`parent`),
  CONSTRAINT `industry_parent_bc62832c_fk_industry_id` FOREIGN KEY (`parent`) REFERENCES `industry` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `industry`
--

LOCK TABLES `industry` WRITE;
/*!40000 ALTER TABLE `industry` DISABLE KEYS */;
INSERT INTO `industry` VALUES (6500,'农、林、牧、渔业',NULL);
INSERT INTO `industry` VALUES (6501,'农业',6500);
INSERT INTO `industry` VALUES (6502,'林业',6500);
INSERT INTO `industry` VALUES (6503,'畜牧业',6500);
INSERT INTO `industry` VALUES (6504,'渔业',6500);
INSERT INTO `industry` VALUES (6505,'农、林、牧、渔专业及辅助性活动',6500);
INSERT INTO `industry` VALUES (6600,'采矿业',NULL);
INSERT INTO `industry` VALUES (6606,'煤炭开采和洗选业',6600);
INSERT INTO `industry` VALUES (6607,'石油和天然气开采业',6600);
INSERT INTO `industry` VALUES (6608,'黑色金属矿采选业',6600);
INSERT INTO `industry` VALUES (6609,'有色金属矿采选业',6600);
INSERT INTO `industry` VALUES (6610,'非金属矿采选业',6600);
INSERT INTO `industry` VALUES (6611,'开采专业及辅助性活动',6600);
INSERT INTO `industry` VALUES (6612,'其他采矿业67',6600);
INSERT INTO `industry` VALUES (6700,'制造业',NULL);
INSERT INTO `industry` VALUES (6713,'农副食品加工业',6700);
INSERT INTO `industry` VALUES (6714,'食品制造业',6700);
INSERT INTO `industry` VALUES (6715,'酒、饮料和精制茶制造业',6700);
INSERT INTO `industry` VALUES (6716,'烟草制品业',6700);
INSERT INTO `industry` VALUES (6717,'纺织业',6700);
INSERT INTO `industry` VALUES (6718,'纺织服装、服饰业',6700);
INSERT INTO `industry` VALUES (6719,'皮革、毛皮、羽毛及其制品和制鞋业',6700);
INSERT INTO `industry` VALUES (6720,'木材加工和木、竹、藤、棕、草制品业',6700);
INSERT INTO `industry` VALUES (6721,'家具制造业',6700);
INSERT INTO `industry` VALUES (6722,'造纸和纸制品业',6700);
INSERT INTO `industry` VALUES (6723,'印刷和记录媒介复制业',6700);
INSERT INTO `industry` VALUES (6724,'文教、工美、体育和娱乐用品制造业',6700);
INSERT INTO `industry` VALUES (6725,'石油、煤炭及其他燃料加工业',6700);
INSERT INTO `industry` VALUES (6726,'化学原料和化学制品制造业',6700);
INSERT INTO `industry` VALUES (6727,'医药制造业',6700);
INSERT INTO `industry` VALUES (6728,'化学纤维制造业',6700);
INSERT INTO `industry` VALUES (6729,'橡胶和塑料制品业',6700);
INSERT INTO `industry` VALUES (6730,'非金属矿物制品业',6700);
INSERT INTO `industry` VALUES (6731,'黑色金属冶炼和压延加工业',6700);
INSERT INTO `industry` VALUES (6732,'有色金属冶炼和压延加工业',6700);
INSERT INTO `industry` VALUES (6733,'金属制品业',6700);
INSERT INTO `industry` VALUES (6734,'通用设备制造业',6700);
INSERT INTO `industry` VALUES (6735,'专用设备制造业',6700);
INSERT INTO `industry` VALUES (6736,'汽车制造业',6700);
INSERT INTO `industry` VALUES (6737,'铁路、船舶、航空航天和其他运输设备制造业',6700);
INSERT INTO `industry` VALUES (6738,'电气机械和器材制造业',6700);
INSERT INTO `industry` VALUES (6739,'计算机、通信和其他电子设备制造业',6700);
INSERT INTO `industry` VALUES (6740,'仪器仪表制造业',6700);
INSERT INTO `industry` VALUES (6741,'其他制造业',6700);
INSERT INTO `industry` VALUES (6742,'废弃资源综合利用业',6700);
INSERT INTO `industry` VALUES (6743,'金属制品、机械和设备修理业',6700);
INSERT INTO `industry` VALUES (6800,'电力、热力、燃气及水生产和供应业',NULL);
INSERT INTO `industry` VALUES (6844,'电力、热力生产和供应业',6800);
INSERT INTO `industry` VALUES (6845,'燃气生产和供应业',6800);
INSERT INTO `industry` VALUES (6846,'水的生产和供应业',6800);
INSERT INTO `industry` VALUES (6900,'建筑业',NULL);
INSERT INTO `industry` VALUES (6947,'房屋建筑业',6900);
INSERT INTO `industry` VALUES (6948,'土木工程建筑业',6900);
INSERT INTO `industry` VALUES (6949,'建筑安装业',6900);
INSERT INTO `industry` VALUES (6950,'建筑装饰、装修和其他建筑业',6900);
INSERT INTO `industry` VALUES (7000,'批发和零售业',NULL);
INSERT INTO `industry` VALUES (7051,'批发业',7000);
INSERT INTO `industry` VALUES (7052,'零售业',7000);
INSERT INTO `industry` VALUES (7100,'交通运输、仓储和邮政业',NULL);
INSERT INTO `industry` VALUES (7153,'铁路运输业',7100);
INSERT INTO `industry` VALUES (7154,'道路运输业',7100);
INSERT INTO `industry` VALUES (7155,'水上运输业',7100);
INSERT INTO `industry` VALUES (7156,'航空运输业',7100);
INSERT INTO `industry` VALUES (7157,'管道运输业',7100);
INSERT INTO `industry` VALUES (7158,'多式联运和运输代理业',7100);
INSERT INTO `industry` VALUES (7159,'装卸搬运和仓储业',7100);
INSERT INTO `industry` VALUES (7160,'邮政业',7100);
INSERT INTO `industry` VALUES (7200,'住宿和餐饮业',NULL);
INSERT INTO `industry` VALUES (7261,'住宿业',7200);
INSERT INTO `industry` VALUES (7262,'餐饮业',7200);
INSERT INTO `industry` VALUES (7300,'信息传输、软件和信息技术服务业',NULL);
INSERT INTO `industry` VALUES (7363,'电信、广播电视和卫星传输服务',7300);
INSERT INTO `industry` VALUES (7364,'互联网和相关服务',7300);
INSERT INTO `industry` VALUES (7365,'软件和信息技术服务业',7300);
INSERT INTO `industry` VALUES (7400,'金融业',NULL);
INSERT INTO `industry` VALUES (7466,'货币金融服务',7400);
INSERT INTO `industry` VALUES (7467,'资本市场服务',7400);
INSERT INTO `industry` VALUES (7468,'保险业',7400);
INSERT INTO `industry` VALUES (7469,'其他金融业',7400);
INSERT INTO `industry` VALUES (7500,'房地产业',NULL);
INSERT INTO `industry` VALUES (7570,'房地产业',7500);
INSERT INTO `industry` VALUES (7600,'租赁和商务服务业',NULL);
INSERT INTO `industry` VALUES (7671,'租赁业',7600);
INSERT INTO `industry` VALUES (7672,'商务服务业',7600);
INSERT INTO `industry` VALUES (7700,'科学研究和技术服务业',NULL);
INSERT INTO `industry` VALUES (7773,'研究和试验发展',7700);
INSERT INTO `industry` VALUES (7774,'专业技术服务业',7700);
INSERT INTO `industry` VALUES (7775,'科技推广和应用服务业',7700);
INSERT INTO `industry` VALUES (7800,'水利、环境和公共设施管理业',NULL);
INSERT INTO `industry` VALUES (7876,'水利管理业',7800);
INSERT INTO `industry` VALUES (7877,'生态保护和环境治理业',7800);
INSERT INTO `industry` VALUES (7878,'公共设施管理业',7800);
INSERT INTO `industry` VALUES (7879,'土地管理业',7800);
INSERT INTO `industry` VALUES (7900,'居民服务、修理和其他服务业',NULL);
INSERT INTO `industry` VALUES (7980,'居民服务业',7900);
INSERT INTO `industry` VALUES (7981,'机动车、电子产品和日用产品修理业',7900);
INSERT INTO `industry` VALUES (7982,'其他服务业',7900);
INSERT INTO `industry` VALUES (8000,'教育',NULL);
INSERT INTO `industry` VALUES (8083,'教育',8000);
INSERT INTO `industry` VALUES (8100,'卫生和社会工作',NULL);
INSERT INTO `industry` VALUES (8184,'卫生',8100);
INSERT INTO `industry` VALUES (8185,'社会工作',8100);
INSERT INTO `industry` VALUES (8200,'文化、体育和娱乐业',NULL);
INSERT INTO `industry` VALUES (8286,'新闻和出版业',8200);
INSERT INTO `industry` VALUES (8287,'广播、电视、电影和录音制作业',8200);
INSERT INTO `industry` VALUES (8288,'文化艺术业',8200);
INSERT INTO `industry` VALUES (8289,'体育',8200);
INSERT INTO `industry` VALUES (8290,'娱乐业',8200);
INSERT INTO `industry` VALUES (8300,'公共管理、社会保障和社会组织',NULL);
INSERT INTO `industry` VALUES (8391,'中国共产党机关',8300);
INSERT INTO `industry` VALUES (8392,'国家机构',8300);
INSERT INTO `industry` VALUES (8393,'人民政协、民主党派',8300);
INSERT INTO `industry` VALUES (8394,'社会保障',8300);
INSERT INTO `industry` VALUES (8395,'群众团体、社会团体和其他成员组织',8300);
INSERT INTO `industry` VALUES (8396,'基层群众自治组织',8300);
INSERT INTO `industry` VALUES (8400,'国际组织',NULL);
INSERT INTO `industry` VALUES (8497,'国际组织',8400);
/*!40000 ALTER TABLE `industry` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2019-01-04 15:11:56
