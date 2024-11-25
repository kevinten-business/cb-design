# multi-cloud

## 跨region数据设计

+ 灾难备份：
+ 故障转移：
+ 成本优化：
+ 数据主权：
+ 特定访问：

### 两个极端

<img width="540" alt="image2024-1-11_11-25-35" src="https://github.com/user-attachments/assets/575a243c-0eae-42b6-b715-37abff2db255">

### 数据设计：

https://developer.aliyun.com/article/862904

#### 三层数据：

+ zone
+ gzone
+ xzone

### 1、（gzone）全局DRC数据同步

![p345140](https://github.com/user-attachments/assets/1f63d2d2-379a-4f99-ab42-447841594878)

### 2、（xzone）星形结构

灾备成本，网状翻倍

引入中间节点，将网状改为星状

但是这样，对于中心城市的要求，比其他城市会更高。比如恢复速度，备份完整性等，这里暂时不展开。我们先假定中心是完全安全的。

![image2024-1-10_21-5-16](https://github.com/user-attachments/assets/00c7b4bf-4f01-4962-bd97-56d0aa6d4075)




