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