-- 原始产品供应源表
CREATE TABLE IF NOT EXISTS raw_supplier (
    id INTEGER PRIMARY KEY AUTOINCREMENT,
    url TEXT NOT NULL,
    content TEXT NOT NULL,
    created_at timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
    updated_at timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP
);

-- 结构化产品供应源表
CREATE TABLE IF NOT EXISTS structured_supplier (
    id INTEGER PRIMARY KEY AUTOINCREMENT,
    name TEXT NOT NULL,
    head_image TEXT,
    url TEXT NOT NULL,
    raw_source_id INTEGER NOT NULL,
    created_at timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
    updated_at timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP
);

-- 批发价表
CREATE TABLE IF NOT EXISTS wholesale_prices (
    id INTEGER PRIMARY KEY AUTOINCREMENT,
    structured_product_id INTEGER NOT NULL,
    min_quantity INTEGER NOT NULL,
    price REAL NOT NULL,
    created_at timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
    updated_at timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP
);
