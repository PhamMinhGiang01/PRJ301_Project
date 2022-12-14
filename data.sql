USE [SE1618_Project_SPR22]
GO
/****** Object:  Table [dbo].[Account]    Script Date: 3/24/2022 3:22:02 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Account](
	[username] [varchar](20) NOT NULL,
	[password] [varchar](20) NOT NULL,
PRIMARY KEY CLUSTERED 
(
	[username] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[Brand]    Script Date: 3/24/2022 3:22:02 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Brand](
	[brand_id] [varchar](30) NOT NULL,
	[brand_name] [varchar](30) NOT NULL,
	[brand_description] [varchar](max) NOT NULL,
PRIMARY KEY CLUSTERED 
(
	[brand_id] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY] TEXTIMAGE_ON [PRIMARY]
GO
/****** Object:  Table [dbo].[Category]    Script Date: 3/24/2022 3:22:02 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Category](
	[cate_id] [varchar](30) NOT NULL,
	[cate_name] [varchar](30) NOT NULL,
	[cate_description] [varchar](max) NOT NULL,
PRIMARY KEY CLUSTERED 
(
	[cate_id] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY] TEXTIMAGE_ON [PRIMARY]
GO
/****** Object:  Table [dbo].[Customer]    Script Date: 3/24/2022 3:22:02 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Customer](
	[customer_id] [varchar](30) NOT NULL,
	[customer_name] [varchar](30) NOT NULL,
	[customer_age] [int] NULL,
	[customer_address] [varchar](30) NULL,
	[customer_phone] [int] NULL,
	[customer_email] [varchar](30) NULL,
	[customer_username] [varchar](30) NULL,
	[customer_password] [varchar](30) NULL,
PRIMARY KEY CLUSTERED 
(
	[customer_id] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[OrderDetails]    Script Date: 3/24/2022 3:22:02 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[OrderDetails](
	[order_id] [int] NOT NULL,
	[product_id] [varchar](30) NOT NULL,
	[quantity] [int] NULL,
	[price] [money] NULL
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[Orders]    Script Date: 3/24/2022 3:22:02 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Orders](
	[order_id] [int] IDENTITY(1,1) NOT NULL,
	[username] [varchar](30) NOT NULL,
	[order_date] [date] NULL,
	[totalmoney] [money] NULL,
PRIMARY KEY CLUSTERED 
(
	[order_id] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[Product]    Script Date: 3/24/2022 3:22:02 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Product](
	[product_id] [varchar](30) NOT NULL,
	[product_name] [varchar](30) NOT NULL,
	[product_image] [varchar](30) NOT NULL,
	[brand_id] [varchar](30) NOT NULL,
	[product_size] [int] NOT NULL,
	[product_price] [money] NOT NULL,
	[product_description] [varchar](30) NOT NULL,
	[tech_id] [varchar](30) NOT NULL,
	[cate_id] [varchar](30) NOT NULL,
PRIMARY KEY CLUSTERED 
(
	[product_id] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[Technology]    Script Date: 3/24/2022 3:22:02 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Technology](
	[tech_id] [varchar](30) NOT NULL,
	[tech_name] [varchar](30) NOT NULL,
	[tech_description] [varchar](max) NOT NULL,
PRIMARY KEY CLUSTERED 
(
	[tech_id] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY] TEXTIMAGE_ON [PRIMARY]
GO
INSERT [dbo].[Account] ([username], [password]) VALUES (N'admin', N'123')
INSERT [dbo].[Account] ([username], [password]) VALUES (N'giang', N'123')
INSERT [dbo].[Account] ([username], [password]) VALUES (N'hanh', N'123')
INSERT [dbo].[Account] ([username], [password]) VALUES (N'minhgiang', N'123456')
INSERT [dbo].[Account] ([username], [password]) VALUES (N'phamminhgiang', N'123456789')
INSERT [dbo].[Account] ([username], [password]) VALUES (N'phu', N'123')
INSERT [dbo].[Account] ([username], [password]) VALUES (N'son', N'123')
INSERT [dbo].[Account] ([username], [password]) VALUES (N'thinh', N'123')
GO
INSERT [dbo].[Brand] ([brand_id], [brand_name], [brand_description]) VALUES (N'acer', N'Acer', N'description')
INSERT [dbo].[Brand] ([brand_id], [brand_name], [brand_description]) VALUES (N'aoc', N'AOC', N'description')
INSERT [dbo].[Brand] ([brand_id], [brand_name], [brand_description]) VALUES (N'asus', N'Asus', N'description')
INSERT [dbo].[Brand] ([brand_id], [brand_name], [brand_description]) VALUES (N'benq', N'BenQ', N'description')
INSERT [dbo].[Brand] ([brand_id], [brand_name], [brand_description]) VALUES (N'dell', N'Dell', N'description')
INSERT [dbo].[Brand] ([brand_id], [brand_name], [brand_description]) VALUES (N'hp', N'HP', N'description')
INSERT [dbo].[Brand] ([brand_id], [brand_name], [brand_description]) VALUES (N'lenovo', N'Lenovo', N'description')
INSERT [dbo].[Brand] ([brand_id], [brand_name], [brand_description]) VALUES (N'lg', N'LG', N'description')
INSERT [dbo].[Brand] ([brand_id], [brand_name], [brand_description]) VALUES (N'samsung', N'SamSung', N'description')
GO
INSERT [dbo].[Category] ([cate_id], [cate_name], [cate_description]) VALUES (N'design', N'Design', N'description')
INSERT [dbo].[Category] ([cate_id], [cate_name], [cate_description]) VALUES (N'game', N'Gaming', N'description')
INSERT [dbo].[Category] ([cate_id], [cate_name], [cate_description]) VALUES (N'orther', N'Orther', N'descripton')
INSERT [dbo].[Category] ([cate_id], [cate_name], [cate_description]) VALUES (N'program', N'Program', N'description')
GO
INSERT [dbo].[Customer] ([customer_id], [customer_name], [customer_age], [customer_address], [customer_phone], [customer_email], [customer_username], [customer_password]) VALUES (N'c1', N'Giang', NULL, NULL, NULL, NULL, N'giang', N'123')
INSERT [dbo].[Customer] ([customer_id], [customer_name], [customer_age], [customer_address], [customer_phone], [customer_email], [customer_username], [customer_password]) VALUES (N'c2', N'MinhGiang', NULL, NULL, NULL, NULL, N'minhgiang', N'123456')
INSERT [dbo].[Customer] ([customer_id], [customer_name], [customer_age], [customer_address], [customer_phone], [customer_email], [customer_username], [customer_password]) VALUES (N'c3', N'PhamMinhGiang', NULL, NULL, NULL, NULL, N'phamminhgiang', N'123456789')
GO
INSERT [dbo].[OrderDetails] ([order_id], [product_id], [quantity], [price]) VALUES (3, N'p1', 1, 3190.0000)
INSERT [dbo].[OrderDetails] ([order_id], [product_id], [quantity], [price]) VALUES (3, N'p10', 1, 5290.0000)
INSERT [dbo].[OrderDetails] ([order_id], [product_id], [quantity], [price]) VALUES (4, N'p3', 2, 6590.0000)
INSERT [dbo].[OrderDetails] ([order_id], [product_id], [quantity], [price]) VALUES (4, N'p1', 1, 3190.0000)
INSERT [dbo].[OrderDetails] ([order_id], [product_id], [quantity], [price]) VALUES (16, N'p17', 1, 3590.0000)
INSERT [dbo].[OrderDetails] ([order_id], [product_id], [quantity], [price]) VALUES (16, N'p19', 4, 14590.0000)
INSERT [dbo].[OrderDetails] ([order_id], [product_id], [quantity], [price]) VALUES (16, N'p9', 1, 18790.0000)
INSERT [dbo].[OrderDetails] ([order_id], [product_id], [quantity], [price]) VALUES (16, N'p6', 4, 9490.0000)
INSERT [dbo].[OrderDetails] ([order_id], [product_id], [quantity], [price]) VALUES (29, N'p10', 2, 1290.0000)
GO
SET IDENTITY_INSERT [dbo].[Orders] ON 

INSERT [dbo].[Orders] ([order_id], [username], [order_date], [totalmoney]) VALUES (2, N'giang', CAST(N'2022-03-14' AS Date), 1.0000)
INSERT [dbo].[Orders] ([order_id], [username], [order_date], [totalmoney]) VALUES (3, N'giang', CAST(N'2022-03-14' AS Date), 8480.0000)
INSERT [dbo].[Orders] ([order_id], [username], [order_date], [totalmoney]) VALUES (4, N'minhgiang', CAST(N'2022-03-15' AS Date), 16370.0000)
INSERT [dbo].[Orders] ([order_id], [username], [order_date], [totalmoney]) VALUES (5, N'son', CAST(N'2022-01-18' AS Date), 54678.0000)
INSERT [dbo].[Orders] ([order_id], [username], [order_date], [totalmoney]) VALUES (6, N'phu', CAST(N'2022-02-17' AS Date), 63456.0000)
INSERT [dbo].[Orders] ([order_id], [username], [order_date], [totalmoney]) VALUES (7, N'giang', CAST(N'2022-04-12' AS Date), 48345.0000)
INSERT [dbo].[Orders] ([order_id], [username], [order_date], [totalmoney]) VALUES (8, N'hanh', CAST(N'2022-05-18' AS Date), 98347.0000)
INSERT [dbo].[Orders] ([order_id], [username], [order_date], [totalmoney]) VALUES (9, N'giang', CAST(N'2022-06-12' AS Date), 56828.0000)
INSERT [dbo].[Orders] ([order_id], [username], [order_date], [totalmoney]) VALUES (10, N'giang', CAST(N'2022-07-12' AS Date), 83245.0000)
INSERT [dbo].[Orders] ([order_id], [username], [order_date], [totalmoney]) VALUES (11, N'giang', CAST(N'2022-08-12' AS Date), 91234.0000)
INSERT [dbo].[Orders] ([order_id], [username], [order_date], [totalmoney]) VALUES (12, N'giang', CAST(N'2022-09-12' AS Date), 34678.0000)
INSERT [dbo].[Orders] ([order_id], [username], [order_date], [totalmoney]) VALUES (13, N'giang', CAST(N'2022-10-12' AS Date), 54236.0000)
INSERT [dbo].[Orders] ([order_id], [username], [order_date], [totalmoney]) VALUES (14, N'giang', CAST(N'2022-11-12' AS Date), 85429.0000)
INSERT [dbo].[Orders] ([order_id], [username], [order_date], [totalmoney]) VALUES (15, N'giang', CAST(N'2022-12-12' AS Date), 79234.0000)
INSERT [dbo].[Orders] ([order_id], [username], [order_date], [totalmoney]) VALUES (16, N'son', CAST(N'2022-03-22' AS Date), 118700.0000)
INSERT [dbo].[Orders] ([order_id], [username], [order_date], [totalmoney]) VALUES (17, N'giang', CAST(N'2021-01-13' AS Date), 123456.0000)
INSERT [dbo].[Orders] ([order_id], [username], [order_date], [totalmoney]) VALUES (18, N'giang', CAST(N'2021-02-13' AS Date), 543234.0000)
INSERT [dbo].[Orders] ([order_id], [username], [order_date], [totalmoney]) VALUES (19, N'giang', CAST(N'2021-03-13' AS Date), 718312.0000)
INSERT [dbo].[Orders] ([order_id], [username], [order_date], [totalmoney]) VALUES (20, N'giang', CAST(N'2021-04-13' AS Date), 485761.0000)
INSERT [dbo].[Orders] ([order_id], [username], [order_date], [totalmoney]) VALUES (21, N'giang', CAST(N'2021-05-13' AS Date), 679123.0000)
INSERT [dbo].[Orders] ([order_id], [username], [order_date], [totalmoney]) VALUES (22, N'giang', CAST(N'2021-06-13' AS Date), 543298.0000)
INSERT [dbo].[Orders] ([order_id], [username], [order_date], [totalmoney]) VALUES (23, N'giang', CAST(N'2021-07-13' AS Date), 943287.0000)
INSERT [dbo].[Orders] ([order_id], [username], [order_date], [totalmoney]) VALUES (24, N'giang', CAST(N'2021-08-13' AS Date), 342127.0000)
INSERT [dbo].[Orders] ([order_id], [username], [order_date], [totalmoney]) VALUES (25, N'giang', CAST(N'2021-09-13' AS Date), 438761.0000)
INSERT [dbo].[Orders] ([order_id], [username], [order_date], [totalmoney]) VALUES (26, N'giang', CAST(N'2021-10-13' AS Date), 758231.0000)
INSERT [dbo].[Orders] ([order_id], [username], [order_date], [totalmoney]) VALUES (27, N'giang', CAST(N'2021-11-13' AS Date), 692341.0000)
INSERT [dbo].[Orders] ([order_id], [username], [order_date], [totalmoney]) VALUES (28, N'giang', CAST(N'2021-12-13' AS Date), 659821.0000)
INSERT [dbo].[Orders] ([order_id], [username], [order_date], [totalmoney]) VALUES (29, N'hanh', CAST(N'2022-03-22' AS Date), 2580.0000)
SET IDENTITY_INSERT [dbo].[Orders] OFF
GO
INSERT [dbo].[Product] ([product_id], [product_name], [product_image], [brand_id], [product_size], [product_price], [product_description], [tech_id], [cate_id]) VALUES (N'p1', N'24MP59G', N'p1.jpg', N'lg', 24, 3190.0000, N'LG Gaming 24 inch', N'ips', N'game')
INSERT [dbo].[Product] ([product_id], [product_name], [product_image], [brand_id], [product_size], [product_price], [product_description], [tech_id], [cate_id]) VALUES (N'p10', N'LF27T450FQEXXV', N'p10.jpg', N'samsung', 27, 1290.0000, N'Samsung 27 inch', N'ips', N'program')
INSERT [dbo].[Product] ([product_id], [product_name], [product_image], [brand_id], [product_size], [product_price], [product_description], [tech_id], [cate_id]) VALUES (N'p11', N'9RV16AA', N'p11.jpg', N'hp', 24, 3890.0000, N'HP 23.8 inch V24i ', N'ips', N'program')
INSERT [dbo].[Product] ([product_id], [product_name], [product_image], [brand_id], [product_size], [product_price], [product_description], [tech_id], [cate_id]) VALUES (N'p12', N'EL2870U', N'p12.jpg', N'benq', 28, 6690.0000, N'Man hinh BenQ', N'tn', N'design')
INSERT [dbo].[Product] ([product_id], [product_name], [product_image], [brand_id], [product_size], [product_price], [product_description], [tech_id], [cate_id]) VALUES (N'p13', N'U2520D', N'p13.jpg', N'dell', 24, 9900.0000, N'Dell UltraSharp 25 inch', N'ips', N'program')
INSERT [dbo].[Product] ([product_id], [product_name], [product_image], [brand_id], [product_size], [product_price], [product_description], [tech_id], [cate_id]) VALUES (N'p14', N'24QP550', N'p14.jpg', N'lg', 24, 6390.0000, N'LG 24 inch', N'ips', N'program')
INSERT [dbo].[Product] ([product_id], [product_name], [product_image], [brand_id], [product_size], [product_price], [product_description], [tech_id], [cate_id]) VALUES (N'p15', N'P2719H', N'p15.jpg', N'dell', 27, 5290.0000, N'Dell 27 inch', N'ips', N'program')
INSERT [dbo].[Product] ([product_id], [product_name], [product_image], [brand_id], [product_size], [product_price], [product_description], [tech_id], [cate_id]) VALUES (N'p16', N'LC24F390FHEXXV', N'p16.jpg', N'samsung', 24, 4090.0000, N'Samsung 24 inch cong', N'va', N'program')
INSERT [dbo].[Product] ([product_id], [product_name], [product_image], [brand_id], [product_size], [product_price], [product_description], [tech_id], [cate_id]) VALUES (N'p17', N'EK220QA', N'p17.jpg', N'acer', 24, 3590.0000, N'ACER 24 inch', N'va', N'program')
INSERT [dbo].[Product] ([product_id], [product_name], [product_image], [brand_id], [product_size], [product_price], [product_description], [tech_id], [cate_id]) VALUES (N'p18', N'PROART PA278QV', N'p18.jpg', N'asus', 27, 9290.0000, N'ASUS 27 PROART ', N'ips', N'design')
INSERT [dbo].[Product] ([product_id], [product_name], [product_image], [brand_id], [product_size], [product_price], [product_description], [tech_id], [cate_id]) VALUES (N'p19', N' P3421W', N'p19.jpg', N'dell', 34, 14590.0000, N'Ultrawide Dell 34 inch cong', N'ips', N'design')
INSERT [dbo].[Product] ([product_id], [product_name], [product_image], [brand_id], [product_size], [product_price], [product_description], [tech_id], [cate_id]) VALUES (N'p2', N'32GN600', N'p2.jpg', N'lg', 32, 8590.0000, N'LG Gaming UltraGear 32 inch', N'tn', N'game')
INSERT [dbo].[Product] ([product_id], [product_name], [product_image], [brand_id], [product_size], [product_price], [product_description], [tech_id], [cate_id]) VALUES (N'p3', N'VG270YS', N'p3.jpg', N'acer', 27, 6590.0000, N'Gaming ACER Nitro 27 inch', N'ips', N'game')
INSERT [dbo].[Product] ([product_id], [product_name], [product_image], [brand_id], [product_size], [product_price], [product_description], [tech_id], [cate_id]) VALUES (N'p4', N'S2421HGF', N'p4.jpg', N'dell', 24, 4990.0000, N'Dell Gaming 24 inch', N'tn', N'game')
INSERT [dbo].[Product] ([product_id], [product_name], [product_image], [brand_id], [product_size], [product_price], [product_description], [tech_id], [cate_id]) VALUES (N'p5', N'VG249Q1R', N'p5.jpg', N'asus', 24, 4890.0000, N'Asus Tuf Gaming 24', N'ips', N'game')
INSERT [dbo].[Product] ([product_id], [product_name], [product_image], [brand_id], [product_size], [product_price], [product_description], [tech_id], [cate_id]) VALUES (N'p6', N'LC32G55TQWEXXV', N'p6.jpg', N'samsung', 32, 9490.0000, N'Samsung Odyssey G5 32 inch', N'va', N'game')
INSERT [dbo].[Product] ([product_id], [product_name], [product_image], [brand_id], [product_size], [product_price], [product_description], [tech_id], [cate_id]) VALUES (N'p7', N'29WP60G', N'p7.jpg', N'lg', 27, 7090.0000, N'LG UltraWide 29 inch', N'ips', N'design')
INSERT [dbo].[Product] ([product_id], [product_name], [product_image], [brand_id], [product_size], [product_price], [product_description], [tech_id], [cate_id]) VALUES (N'p8', N'U2422HE', N'p8.jpg', N'dell', 24, 7590.0000, N'Dell Ultrasharp 24 inch', N'ips', N'design')
INSERT [dbo].[Product] ([product_id], [product_name], [product_image], [brand_id], [product_size], [product_price], [product_description], [tech_id], [cate_id]) VALUES (N'p9', N'32UN880', N'p9.jpg', N'lg', 32, 18790.0000, N'LG Designer 32 inch', N'ips', N'design')
GO
INSERT [dbo].[Technology] ([tech_id], [tech_name], [tech_description]) VALUES (N'ips', N'IPS', N'description')
INSERT [dbo].[Technology] ([tech_id], [tech_name], [tech_description]) VALUES (N'oled', N'OLED', N'description')
INSERT [dbo].[Technology] ([tech_id], [tech_name], [tech_description]) VALUES (N'tn', N'TN', N'description')
INSERT [dbo].[Technology] ([tech_id], [tech_name], [tech_description]) VALUES (N'va', N'VA', N'description')
GO
ALTER TABLE [dbo].[OrderDetails]  WITH CHECK ADD FOREIGN KEY([order_id])
REFERENCES [dbo].[Orders] ([order_id])
GO
ALTER TABLE [dbo].[OrderDetails]  WITH CHECK ADD FOREIGN KEY([product_id])
REFERENCES [dbo].[Product] ([product_id])
GO
ALTER TABLE [dbo].[Product]  WITH CHECK ADD FOREIGN KEY([brand_id])
REFERENCES [dbo].[Brand] ([brand_id])
GO
ALTER TABLE [dbo].[Product]  WITH CHECK ADD FOREIGN KEY([cate_id])
REFERENCES [dbo].[Category] ([cate_id])
GO
ALTER TABLE [dbo].[Product]  WITH CHECK ADD FOREIGN KEY([tech_id])
REFERENCES [dbo].[Technology] ([tech_id])
GO
