/*
Navicat MySQL Data Transfer

Source Server         : localhost_3306
Source Server Version : 50530
Source Host           : localhost:3306
Source Database       : sharding_0

Target Server Type    : MYSQL
Target Server Version : 50530
File Encoding         : 65001

Date: 2018-04-17 17:44:46
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `t_order_0`
-- ----------------------------
DROP TABLE IF EXISTS `t_order_0`;
CREATE TABLE `t_order_0` (
  `order_id` bigint(11) NOT NULL,
  `user_id` bigint(11) NOT NULL,
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_order_0
-- ----------------------------
INSERT INTO `t_order_0` VALUES ('12', '11', '6');
INSERT INTO `t_order_0` VALUES ('21', '12', '7');

-- ----------------------------
-- Table structure for `t_order_1`
-- ----------------------------
DROP TABLE IF EXISTS `t_order_1`;
CREATE TABLE `t_order_1` (
  `order_id` bigint(11) NOT NULL,
  `user_id` bigint(11) NOT NULL,
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_order_1
-- ----------------------------
INSERT INTO `t_order_1` VALUES ('13', '11', '6');

-- ----------------------------
-- Table structure for `t_order_2`
-- ----------------------------
DROP TABLE IF EXISTS `t_order_2`;
CREATE TABLE `t_order_2` (
  `order_id` bigint(11) NOT NULL,
  `user_id` bigint(11) NOT NULL,
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_order_2
-- ----------------------------
INSERT INTO `t_order_2` VALUES ('11', '11', '5');
INSERT INTO `t_order_2` VALUES ('20', '11', '6');

-- ----------------------------
-- Table structure for `t_student_0`
-- ----------------------------
DROP TABLE IF EXISTS `t_student_0`;
CREATE TABLE `t_student_0` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `student_id` int(11) NOT NULL,
  `name` varchar(255) NOT NULL,
  `age` int(11) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=15 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_student_0
-- ----------------------------
INSERT INTO `t_student_0` VALUES ('3', '11', 'jack', '12');
INSERT INTO `t_student_0` VALUES ('4', '21', 'hehe', '21');
INSERT INTO `t_student_0` VALUES ('5', '21', 'hehe1', '21');
INSERT INTO `t_student_0` VALUES ('6', '21', 'hehe1', '21');
INSERT INTO `t_student_0` VALUES ('7', '21', 'hehe2222', '21');
INSERT INTO `t_student_0` VALUES ('8', '21', '异常....', '21');
INSERT INTO `t_student_0` VALUES ('11', '21', '异常....1111', '21');
INSERT INTO `t_student_0` VALUES ('12', '21', '异常....1111', '21');
INSERT INTO `t_student_0` VALUES ('14', '0', 'jack', '12');

-- ----------------------------
-- Table structure for `t_student_1`
-- ----------------------------
DROP TABLE IF EXISTS `t_student_1`;
CREATE TABLE `t_student_1` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `student_id` int(11) NOT NULL,
  `name` varchar(255) NOT NULL,
  `age` int(11) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=15 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_student_1
-- ----------------------------
INSERT INTO `t_student_1` VALUES ('3', '11', 'jack', '12');
INSERT INTO `t_student_1` VALUES ('4', '21', 'hehe', '21');
INSERT INTO `t_student_1` VALUES ('5', '21', 'hehe1', '21');
INSERT INTO `t_student_1` VALUES ('6', '21', 'hehe1', '21');
INSERT INTO `t_student_1` VALUES ('7', '21', 'hehe2222', '21');
INSERT INTO `t_student_1` VALUES ('8', '21', '异常....', '21');
INSERT INTO `t_student_1` VALUES ('11', '21', '异常....1111', '21');
INSERT INTO `t_student_1` VALUES ('12', '21', '异常....1111', '21');
INSERT INTO `t_student_1` VALUES ('14', '0', 'jack', '12');

-- ----------------------------
-- Table structure for `t_user_0`
-- ----------------------------
DROP TABLE IF EXISTS `t_user_0`;
CREATE TABLE `t_user_0` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `user_id` int(11) NOT NULL,
  `name` varchar(255) NOT NULL,
  `age` int(11) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=14 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_user_0
-- ----------------------------
INSERT INTO `t_user_0` VALUES ('1', '10', 'lwl', '22');
INSERT INTO `t_user_0` VALUES ('2', '11', 'tommy', '1');
INSERT INTO `t_user_0` VALUES ('3', '13', 'war3 1.27', '25');
INSERT INTO `t_user_0` VALUES ('4', '13', 'war3 1.27 good', '25');
INSERT INTO `t_user_0` VALUES ('5', '13', 'war3 1.27 good', '25');
INSERT INTO `t_user_0` VALUES ('6', '13', '22222222222', '25');
INSERT INTO `t_user_0` VALUES ('7', '13', '异常....', '25');
INSERT INTO `t_user_0` VALUES ('10', '13', '异常....1111', '25');
INSERT INTO `t_user_0` VALUES ('11', '13', '异常....1111', '25');
INSERT INTO `t_user_0` VALUES ('13', '11', 'github', '25');

-- ----------------------------
-- Table structure for `t_user_1`
-- ----------------------------
DROP TABLE IF EXISTS `t_user_1`;
CREATE TABLE `t_user_1` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `user_id` int(11) NOT NULL,
  `name` varchar(255) NOT NULL,
  `age` int(11) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=14 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_user_1
-- ----------------------------
INSERT INTO `t_user_1` VALUES ('1', '10', 'lwl', '22');
INSERT INTO `t_user_1` VALUES ('2', '11', 'tommy', '1');
INSERT INTO `t_user_1` VALUES ('3', '13', 'war3 1.27', '25');
INSERT INTO `t_user_1` VALUES ('4', '13', 'war3 1.27 good', '25');
INSERT INTO `t_user_1` VALUES ('5', '13', 'war3 1.27 good', '25');
INSERT INTO `t_user_1` VALUES ('6', '13', '22222222222', '25');
INSERT INTO `t_user_1` VALUES ('7', '13', '异常....', '25');
INSERT INTO `t_user_1` VALUES ('10', '13', '异常....1111', '25');
INSERT INTO `t_user_1` VALUES ('11', '13', '异常....1111', '25');
INSERT INTO `t_user_1` VALUES ('13', '11', 'github', '25');

-- ----------------------------
-- Table structure for `t_user_2`
-- ----------------------------
DROP TABLE IF EXISTS `t_user_2`;
CREATE TABLE `t_user_2` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `user_id` int(11) NOT NULL,
  `name` varchar(255) NOT NULL,
  `age` int(11) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=14 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_user_2
-- ----------------------------
INSERT INTO `t_user_2` VALUES ('1', '10', 'lwl', '22');
INSERT INTO `t_user_2` VALUES ('2', '11', 'tommy', '1');
INSERT INTO `t_user_2` VALUES ('3', '13', 'war3 1.27', '25');
INSERT INTO `t_user_2` VALUES ('4', '13', 'war3 1.27 good', '25');
INSERT INTO `t_user_2` VALUES ('5', '13', 'war3 1.27 good', '25');
INSERT INTO `t_user_2` VALUES ('6', '13', '22222222222', '25');
INSERT INTO `t_user_2` VALUES ('7', '13', '异常....', '25');
INSERT INTO `t_user_2` VALUES ('10', '13', '异常....1111', '25');
INSERT INTO `t_user_2` VALUES ('11', '13', '异常....1111', '25');
INSERT INTO `t_user_2` VALUES ('13', '11', 'github', '25');
