LOAD DATA INFILE 'real_estates_20130801_20140731_berlin_living_rent_hist.dsv' INTO TABLE real_estates_hist COLUMNS TERMINATED BY '|' OPTIONALLY ENCLOSED BY '"' ESCAPED BY '"' LINES TERMINATED BY '\n';
LOAD DATA INFILE 'real_estates_20130801_20140731_berlin_living_rent_hist.dsv' INTO TABLE real_estates_hist COLUMNS TERMINATED BY '|' OPTIONALLY ENCLOSED BY '"' ESCAPED BY '"' LINES TERMINATED BY '\n';
-- sudo cp Berlin_Friedrichshain_KBerg_Mitte_apartments_buy.csv /var/lib/mysql/yin
LOAD DATA INFILE 'Berlin_Friedrichshain_KBerg_Mitte_apartments_buy.csv' INTO TABLE districts_data COLUMNS TERMINATED BY ',' OPTIONALLY ENCLOSED BY '"' ESCAPED BY '"' LINES TERMINATED BY '\n' ignore 1 lines;