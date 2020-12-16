-- noinspection SqlDialectInspectionForFile




CREATE TABLE if not exists `course` (
  `courseId` varchar(20) NOT NULL,
  `courseName` varchar(20) DEFAULT NULL,
  `credit` varchar(20) DEFAULT NULL,
  `term` varchar(20) DEFAULT NULL,
  `teacherName` varchar(20) DEFAULT NULL,
  `studentId` varchar(20) DEFAULT NULL,
  `achievement` int(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `course` */

insert  into `course`(`courseId`,`courseName`,`credit`,`term`,`teacherName`,`studentId`,`achievement`) values ('C00001','高级语言程序设计','3','大一上','陈老师','S00001',71),('C00001','高级语言程序设计','3','大一上','陈老师','S00002',95),('C00001','高级语言程序设计','3','大一上','陈老师','S00003',77),('C00001','高级语言程序设计','3','大一上','陈老师','S00004',77),('C00001','高级语言程序设计','3','大一上','陈老师','S00005',83),('C00001','高级语言程序设计','3','大一上','陈老师','S00006',69),('C00001','高级语言程序设计','3','大一上','陈老师','S00007',86),('C00001','高级语言程序设计','3','大一上','陈老师','S00008',70),('C00001','高级语言程序设计','3','大一上','陈老师','S00009',72),('C00001','高级语言程序设计','3','大一上','陈老师','S00010',62),('C00001','高级语言程序设计','3','大一上','陈老师','S00011',81),('C00001','高级语言程序设计','3','大一上','陈老师','S00012',66),('C00001','高级语言程序设计','3','大一上','陈老师','S00013',78),('C00001','高级语言程序设计','3','大一上','陈老师','S00014',83),('C00001','高级语言程序设计','3','大一上','陈老师','S00015',81),('C00001','高级语言程序设计','3','大一上','陈老师','S00016',89),('C00001','高级语言程序设计','3','大一上','陈老师','S00017',77),('C00001','高级语言程序设计','3','大一上','陈老师','S00018',77),('C00001','高级语言程序设计','3','大一上','陈老师','S00019',73),('C00001','高级语言程序设计','3','大一上','陈老师','S00020',93),('C00002','面向对象程序设计','4','大一下','赵老师','S00021',85),('C00002','面向对象程序设计','4','大一下','赵老师','S00022',96),('C00002','面向对象程序设计','4','大一下','赵老师','S00023',89),('C00002','面向对象程序设计','4','大一下','赵老师','S00024',80),('C00002','面向对象程序设计','4','大一下','赵老师','S00025',87),('C00002','面向对象程序设计','4','大一下','赵老师','S00026',68),('C00002','面向对象程序设计','4','大一下','赵老师','S00027',76),('C00002','面向对象程序设计','4','大一下','赵老师','S00028',82),('C00002','面向对象程序设计','4','大一下','赵老师','S00029',83),('C00002','面向对象程序设计','4','大一下','赵老师','S00030',73),('C00002','面向对象程序设计','4','大一下','赵老师','S00031',73),('C00002','面向对象程序设计','4','大一下','赵老师','S00032',69),('C00002','面向对象程序设计','4','大一下','赵老师','S00033',75),('C00002','面向对象程序设计','4','大一下','赵老师','S00034',69),('C00002','面向对象程序设计','4','大一下','赵老师','S00035',80),('C00002','面向对象程序设计','4','大一下','赵老师','S00036',76),('C00002','面向对象程序设计','4','大一下','赵老师','S00037',88),('C00002','面向对象程序设计','4','大一下','赵老师','S00038',78),('C00002','面向对象程序设计','4','大一下','赵老师','S00039',96),('C00002','面向对象程序设计','4','大一下','赵老师','S00040',84),('C00003','光学','3','大一下','郭老师','S00041',86),('C00003','光学','3','大一下','郭老师','S00042',84),('C00003','光学','3','大一下','郭老师','S00043',74),('C00003','光学','3','大一下','郭老师','S00044',84),('C00003','光学','3','大一下','郭老师','S00045',73),('C00003','光学','3','大一下','郭老师','S00046',73),('C00003','光学','3','大一下','郭老师','S00047',69),('C00003','光学','3','大一下','郭老师','S00048',74),('C00003','光学','3','大一下','郭老师','S00049',62),('C00003','光学','3','大一下','郭老师','S00050',76),('C00003','光学','3','大一下','郭老师','S00051',78),('C00003','光学','3','大一下','郭老师','S00052',86),('C00003','光学','3','大一下','郭老师','S00053',74),('C00003','光学','3','大一下','郭老师','S00054',91),('C00003','光学','3','大一下','郭老师','S00055',75),('C00003','光学','3','大一下','郭老师','S00056',76),('C00003','光学','3','大一下','郭老师','S00057',94),('C00003','光学','3','大一下','郭老师','S00058',79),('C00003','光学','3','大一下','郭老师','S00059',75),('C00003','光学','3','大一下','郭老师','S00060',85),('C00004','数学分析','4','大一下','尤老师','S00061',64),('C00004','数学分析','4','大一下','尤老师','S00062',63),('C00004','数学分析','4','大一下','尤老师','S00063',85),('C00004','数学分析','4','大一下','尤老师','S00064',77),('C00004','数学分析','4','大一下','尤老师','S00065',80),('C00004','数学分析','4','大一下','尤老师','S00066',80),('C00004','数学分析','4','大一下','尤老师','S00067',73),('C00004','数学分析','4','大一下','尤老师','S00068',63),('C00004','数学分析','4','大一下','尤老师','S00069',70),('C00004','数学分析','4','大一下','尤老师','S00070',90),('C00004','数学分析','4','大一下','尤老师','S00071',94),('C00004','数学分析','4','大一下','尤老师','S00072',63),('C00004','数学分析','4','大一下','尤老师','S00073',87),('C00004','数学分析','4','大一下','尤老师','S00074',60),('C00004','数学分析','4','大一下','尤老师','S00075',87),('C00004','数学分析','4','大一下','尤老师','S00076',75),('C00004','数学分析','4','大一下','尤老师','S00077',68),('C00004','数学分析','4','大一下','尤老师','S00078',65),('C00004','数学分析','4','大一下','尤老师','S00079',91),('C00004','数学分析','4','大一下','尤老师','S00080',60),('C00005','通信原理','4','大二上','张老师','S00081',93),('C00005','通信原理','4','大二上','张老师','S00082',87),('C00005','通信原理','4','大二上','张老师','S00083',74),('C00005','通信原理','4','大二上','张老师','S00084',84),('C00005','通信原理','4','大二上','张老师','S00085',75),('C00005','通信原理','4','大二上','张老师','S00086',94),('C00005','通信原理','4','大二上','张老师','S00087',91),('C00005','通信原理','4','大二上','张老师','S00088',74),('C00005','通信原理','4','大二上','张老师','S00089',79),('C00005','通信原理','4','大二上','张老师','S00090',84),('C00005','通信原理','4','大二上','张老师','S00091',87),('C00005','通信原理','4','大二上','张老师','S00092',81),('C00005','通信原理','4','大二上','张老师','S00093',67),('C00005','通信原理','4','大二上','张老师','S00094',79),('C00005','通信原理','4','大二上','张老师','S00095',65),('C00005','通信原理','4','大二上','张老师','S00096',68),('C00005','通信原理','4','大二上','张老师','S00097',89),('C00005','通信原理','4','大二上','张老师','S00098',78),('C00005','通信原理','4','大二上','张老师','S00099',78),('C00005','通信原理','4','大二上','张老师','S00100',86),('C00006','信号与系统','3','大二上','杨老师','S00101',83),('C00006','信号与系统','3','大二上','杨老师','S00102',79),('C00006','信号与系统','3','大二上','杨老师','S00103',88),('C00006','信号与系统','3','大二上','杨老师','S00104',76),('C00006','信号与系统','3','大二上','杨老师','S00105',67),('C00006','信号与系统','3','大二上','杨老师','S00106',67),('C00006','信号与系统','3','大二上','杨老师','S00107',92),('C00006','信号与系统','3','大二上','杨老师','S00108',87),('C00006','信号与系统','3','大二上','杨老师','S00109',68),('C00006','信号与系统','3','大二上','杨老师','S00110',90),('C00006','信号与系统','3','大二上','杨老师','S00111',79),('C00006','信号与系统','3','大二上','杨老师','S00112',70),('C00006','信号与系统','3','大二上','杨老师','S00113',94),('C00006','信号与系统','3','大二上','杨老师','S00114',76),('C00006','信号与系统','3','大二上','杨老师','S00115',66),('C00006','信号与系统','3','大二上','杨老师','S00116',76),('C00006','信号与系统','3','大二上','杨老师','S00117',83),('C00006','信号与系统','3','大二上','杨老师','S00118',69),('C00006','信号与系统','3','大二上','杨老师','S00119',69),('C00006','信号与系统','3','大二上','杨老师','S00120',85),('C00007','商务英语','2','大一下','王老师','S00121',67),('C00007','商务英语','2','大一下','王老师','S00122',84),('C00007','商务英语','2','大一下','王老师','S00123',79),('C00007','商务英语','2','大一下','王老师','S00124',82),('C00007','商务英语','2','大一下','王老师','S00125',81),('C00007','商务英语','2','大一下','王老师','S00126',77),('C00007','商务英语','2','大一下','王老师','S00127',87),('C00007','商务英语','2','大一下','王老师','S00128',89),('C00007','商务英语','2','大一下','王老师','S00129',83),('C00007','商务英语','2','大一下','王老师','S00130',75),('C00007','商务英语','2','大一下','王老师','S00131',82),('C00007','商务英语','2','大一下','王老师','S00132',76),('C00007','商务英语','2','大一下','王老师','S00133',84),('C00007','商务英语','2','大一下','王老师','S00134',68),('C00007','商务英语','2','大一下','王老师','S00135',72),('C00007','商务英语','2','大一下','王老师','S00136',80),('C00007','商务英语','2','大一下','王老师','S00137',69),('C00007','商务英语','2','大一下','王老师','S00138',70),('C00007','商务英语','2','大一下','王老师','S00139',90),('C00007','商务英语','2','大一下','王老师','S00140',68),('C00008','商务日语','2','大一下','吴老师','S00141',73),('C00008','商务日语','2','大一下','吴老师','S00142',91),('C00008','商务日语','2','大一下','吴老师','S00143',91),('C00008','商务日语','2','大一下','吴老师','S00144',84),('C00008','商务日语','2','大一下','吴老师','S00145',78),('C00008','商务日语','2','大一下','吴老师','S00146',85),('C00008','商务日语','2','大一下','吴老师','S00147',83),('C00008','商务日语','2','大一下','吴老师','S00148',71),('C00008','商务日语','2','大一下','吴老师','S00149',79),('C00008','商务日语','2','大一下','吴老师','S00150',72),('C00008','商务日语','2','大一下','吴老师','S00151',68),('C00008','商务日语','2','大一下','吴老师','S00152',89),('C00008','商务日语','2','大一下','吴老师','S00153',92),('C00008','商务日语','2','大一下','吴老师','S00154',90),('C00008','商务日语','2','大一下','吴老师','S00155',89),('C00008','商务日语','2','大一下','吴老师','S00156',94),('C00008','商务日语','2','大一下','吴老师','S00157',67),('C00008','商务日语','2','大一下','吴老师','S00158',80),('C00008','商务日语','2','大一下','吴老师','S00159',91),('C00008','商务日语','2','大一下','吴老师','S00160',94),('C00009','国际贸易','3','大二上','刘老师','S00161',95),('C00009','国际贸易','3','大二上','刘老师','S00162',83),('C00009','国际贸易','3','大二上','刘老师','S00163',86),('C00009','国际贸易','3','大二上','刘老师','S00164',72),('C00009','国际贸易','3','大二上','刘老师','S00165',75),('C00009','国际贸易','3','大二上','刘老师','S00166',89),('C00009','国际贸易','3','大二上','刘老师','S00167',88),('C00009','国际贸易','3','大二上','刘老师','S00168',86),('C00009','国际贸易','3','大二上','刘老师','S00169',92),('C00009','国际贸易','3','大二上','刘老师','S00170',85),('C00009','国际贸易','3','大二上','刘老师','S00171',92),('C00009','国际贸易','3','大二上','刘老师','S00172',68),('C00009','国际贸易','3','大二上','刘老师','S00173',65),('C00009','国际贸易','3','大二上','刘老师','S00174',85),('C00009','国际贸易','3','大二上','刘老师','S00175',75),('C00009','国际贸易','3','大二上','刘老师','S00176',70),('C00009','国际贸易','3','大二上','刘老师','S00177',88),('C00009','国际贸易','3','大二上','刘老师','S00178',92),('C00009','国际贸易','3','大二上','刘老师','S00179',65),('C00009','国际贸易','3','大二上','刘老师','S00180',86),('C00010','公司人力资源管理','2','大二下','陆老师','S00181',79),('C00010','公司人力资源管理','2','大二下','陆老师','S00182',71),('C00010','公司人力资源管理','2','大二下','陆老师','S00183',89),('C00010','公司人力资源管理','2','大二下','陆老师','S00184',93),('C00010','公司人力资源管理','2','大二下','陆老师','S00185',85),('C00010','公司人力资源管理','2','大二下','陆老师','S00186',67),('C00010','公司人力资源管理','2','大二下','陆老师','S00187',77),('C00010','公司人力资源管理','2','大二下','陆老师','S00188',69),('C00010','公司人力资源管理','2','大二下','陆老师','S00189',71),('C00010','公司人力资源管理','2','大二下','陆老师','S00190',89),('C00010','公司人力资源管理','2','大二下','陆老师','S00191',66),('C00010','公司人力资源管理','2','大二下','陆老师','S00192',81),('C00010','公司人力资源管理','2','大二下','陆老师','S00193',68),('C00010','公司人力资源管理','2','大二下','陆老师','S00194',88),('C00010','公司人力资源管理','2','大二下','陆老师','S00195',70),('C00010','公司人力资源管理','2','大二下','陆老师','S00196',77),('C00010','公司人力资源管理','2','大二下','陆老师','S00197',70),('C00010','公司人力资源管理','2','大二下','陆老师','S00198',65),('C00010','公司人力资源管理','2','大二下','陆老师','S00199',87),('C00010','公司人力资源管理','2','大二下','陆老师','S00200',70);

/*Table structure for table `dormitory` */




