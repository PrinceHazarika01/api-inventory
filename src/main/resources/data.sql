INSERT INTO inventories
(name, category, sub_category, manufacturing_date, expiry_date,
 specification, price, stock, model, seller, location, brand, active)
VALUES
    ('iPhone 15', 'Electronics', 'Mobile',
     DATE '2024-01-01',
     DATE '2026-01-01',
     '128GB variant',
     75000,
     10,
     'A2890',
     'Amazon',
     'Bangalore',
     'Apple',
     true);

INSERT INTO inventories
(name, category, sub_category, manufacturing_date, expiry_date,
 specification, price, stock, model, seller, location, brand, active)
VALUES
    ('Samsung TV', 'Electronics', 'Television',
     DATE '2023-05-01',
     DATE '2028-05-01',
     '55 inch 4K',
     55000,
     5,
     'QLED55',
     'Flipkart',
     'Mumbai',
     'Samsung',
     true);

INSERT INTO inventories
(name, category, sub_category, manufacturing_date, expiry_date,
 specification, price, stock, model, seller, location, brand, active)
VALUES
    ('MacBook Air M2', 'Electronics', 'Laptop',
     DATE '2024-02-01', DATE '2028-02-01',
     '8GB RAM 256GB SSD', 115000, 7,
     'M2-2024', 'Amazon', 'Bangalore', 'Apple', true),

    ('Dell XPS 15', 'Electronics', 'Laptop',
     DATE '2023-11-01', DATE '2027-11-01',
     '16GB RAM 512GB SSD', 145000, 4,
     'XPS9520', 'Flipkart', 'Delhi', 'Dell', true),

    ('Sony Headphones', 'Electronics', 'Audio',
     DATE '2024-03-01', DATE '2027-03-01',
     'Noise Cancelling', 18000, 15,
     'WH1000XM5', 'Amazon', 'Mumbai', 'Sony', true),

    ('HP Printer', 'Electronics', 'Printer',
     DATE '2023-06-01', DATE '2026-06-01',
     'All-in-One Inkjet', 12000, 6,
     'HP2135', 'Flipkart', 'Chennai', 'HP', true),

    ('LG Refrigerator', 'Appliances', 'Refrigerator',
     DATE '2024-01-10', DATE '2030-01-10',
     'Double Door 260L', 32000, 3,
     'LG260DD', 'Reliance Digital', 'Hyderabad', 'LG', true),

    ('Whirlpool Washing Machine', 'Appliances', 'Washing Machine',
     DATE '2023-09-15', DATE '2029-09-15',
     '7kg Fully Automatic', 25000, 5,
     'WH7KG', 'Amazon', 'Pune', 'Whirlpool', true),

    ('Nike Running Shoes', 'Fashion', 'Footwear',
     DATE '2024-04-01', DATE '2027-04-01',
     'Lightweight Mesh', 6000, 20,
     'NK-RUN2024', 'Myntra', 'Bangalore', 'Nike', true),

    ('Adidas T-Shirt', 'Fashion', 'Clothing',
     DATE '2024-02-15', DATE '2026-02-15',
     'Cotton Slim Fit', 1500, 40,
     'ADTS2024', 'Myntra', 'Mumbai', 'Adidas', true),

    ('Wooden Dining Table', 'Furniture', 'Dining',
     DATE '2023-01-01', DATE '2035-01-01',
     '6 Seater Teak Wood', 45000, 2,
     'DT-TEAK6', 'IKEA', 'Hyderabad', 'IKEA', true),

    ('Office Chair', 'Furniture', 'Chair',
     DATE '2024-03-01', DATE '2030-03-01',
     'Ergonomic Adjustable', 9000, 12,
     'OC-ERG2024', 'Amazon', 'Delhi', 'GreenSoul', true),

    ('Yoga Mat', 'Sports', 'Fitness',
     DATE '2024-01-01', DATE '2026-01-01',
     'Anti-slip 6mm', 1200, 30,
     'YM-6MM', 'Flipkart', 'Chennai', 'Boldfit', true),

    ('Cricket Bat', 'Sports', 'Cricket',
     DATE '2023-12-01', DATE '2026-12-01',
     'English Willow Grade 1', 8500, 18,
     'SS-TON', 'Amazon', 'Kolkata', 'SS', true),

    ('Football', 'Sports', 'Outdoor',
     DATE '2024-01-15', DATE '2026-01-15',
     'FIFA Approved Size 5', 2200, 25,
     'FB-2024', 'Flipkart', 'Delhi', 'Nivia', true),

    ('Treadmill', 'Sports', 'Fitness',
     DATE '2023-08-01', DATE '2029-08-01',
     'Motorized 3HP', 55000, 4,
     'TR-3HP', 'Amazon', 'Bangalore', 'PowerMax', true),

    ('Basmati Rice 5kg', 'Grocery', 'Grains',
     DATE '2025-01-01', DATE '2026-01-01',
     'Premium Long Grain', 600, 100,
     'BR-5KG', 'BigBasket', 'Hyderabad', 'IndiaGate', true),

    ('Sunflower Oil 1L', 'Grocery', 'Oil',
     DATE '2025-02-01', DATE '2026-02-01',
     'Refined Oil', 150, 150,
     'SO-1L', 'BigBasket', 'Mumbai', 'Fortune', true),

    ('Amul Butter', 'Grocery', 'Dairy',
     DATE '2025-02-10', DATE '2025-08-10',
     '500g Salted', 280, 60,
     'AM-BTR500', 'Reliance Fresh', 'Pune', 'Amul', true),

    ('Protein Powder', 'Health', 'Supplements',
     DATE '2024-12-01', DATE '2026-12-01',
     'Whey Protein 1kg', 3200, 35,
     'ON-WHEY1KG', 'Amazon', 'Chennai', 'Optimum Nutrition', true),

    ('Vitamin C Tablets', 'Health', 'Supplements',
     DATE '2024-10-01', DATE '2026-10-01',
     '100 Tablets 500mg', 450, 80,
     'VC-500', 'Flipkart', 'Bangalore', 'HealthKart', true),

    ('The Alchemist', 'Books', 'Novel',
     DATE '2023-01-01', DATE '2030-01-01',
     'Paperback Edition', 399, 50,
     'BK-ALC', 'Amazon', 'Delhi', 'HarperCollins', true),

    ('Clean Code', 'Books', 'Programming',
     DATE '2022-01-01', DATE '2032-01-01',
     'Robert C Martin', 699, 30,
     'BK-CCODE', 'Amazon', 'Mumbai', 'Prentice Hall', true),

    ('Face Wash', 'Beauty', 'Skincare',
     DATE '2025-01-01', DATE '2026-06-01',
     'Oil Control 100ml', 250, 70,
     'FW-100ML', 'Nykaa', 'Bangalore', 'Garnier', true),

    ('Lipstick', 'Beauty', 'Cosmetics',
     DATE '2024-11-01', DATE '2027-11-01',
     'Matte Finish', 499, 90,
     'LS-MATTE', 'Nykaa', 'Delhi', 'Maybelline', true),

    ('Hair Dryer', 'Electronics', 'Personal Care',
     DATE '2024-03-01', DATE '2027-03-01',
     '1200W Foldable', 1800, 22,
     'HD-1200W', 'Amazon', 'Hyderabad', 'Philips', true),

    ('Bluetooth Speaker', 'Electronics', 'Audio',
     DATE '2024-04-01', DATE '2027-04-01',
     'Portable 20W', 3500, 16,
     'BS-20W', 'Flipkart', 'Mumbai', 'JBL', true),

    ('Tablet', 'Electronics', 'Mobile',
     DATE '2024-05-01', DATE '2028-05-01',
     '10 inch 128GB', 28000, 9,
     'TAB-128', 'Amazon', 'Chennai', 'Samsung', true),

    ('Gaming Mouse', 'Electronics', 'Accessories',
     DATE '2024-02-01', DATE '2027-02-01',
     'RGB 16000 DPI', 2500, 45,
     'GM-RGB', 'Flipkart', 'Bangalore', 'Logitech', true),

    ('Keyboard Mechanical', 'Electronics', 'Accessories',
     DATE '2024-01-01', DATE '2027-01-01',
     'Blue Switch', 4500, 28,
     'KB-MECH', 'Amazon', 'Delhi', 'Redragon', true),

    ('Water Bottle', 'Home', 'Kitchen',
     DATE '2024-01-01', DATE '2030-01-01',
     'Steel 1L', 600, 75,
     'WB-1L', 'Flipkart', 'Pune', 'Milton', true),

    ('Microwave Oven', 'Appliances', 'Kitchen',
     DATE '2023-07-01', DATE '2029-07-01',
     '28L Convection', 15000, 6,
     'MW-28L', 'Amazon', 'Hyderabad', 'IFB', true),

    ('Air Conditioner', 'Appliances', 'Cooling',
     DATE '2024-03-01', DATE '2032-03-01',
     '1.5 Ton Inverter', 42000, 5,
     'AC-1.5T', 'Reliance Digital', 'Chennai', 'Daikin', true),

    ('Sofa Set', 'Furniture', 'Living Room',
     DATE '2023-02-01', DATE '2035-02-01',
     '3+2 Seater Fabric', 65000, 2,
     'SF-32', 'IKEA', 'Bangalore', 'UrbanLadder', true),

    ('Study Table', 'Furniture', 'Office',
     DATE '2024-01-01', DATE '2034-01-01',
     'Engineered Wood', 8500, 14,
     'ST-ENG', 'Amazon', 'Delhi', 'Nilkamal', true),

    ('Backpack', 'Fashion', 'Accessories',
     DATE '2024-01-15', DATE '2027-01-15',
     'Laptop 30L', 2200, 60,
     'BP-30L', 'Myntra', 'Mumbai', 'Wildcraft', true),

    ('Smart Watch', 'Electronics', 'Wearable',
     DATE '2024-04-01', DATE '2028-04-01',
     'AMOLED Display', 12000, 18,
     'SW-AMOLED', 'Amazon', 'Bangalore', 'Boat', true),

    ('Induction Cooktop', 'Appliances', 'Kitchen',
     DATE '2024-02-01', DATE '2028-02-01',
     '2000W Touch Panel', 3200, 20,
     'IC-2000W', 'Flipkart', 'Hyderabad', 'Prestige', true);