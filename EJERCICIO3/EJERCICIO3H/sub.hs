subconjunto :: Eq a => [a] -> [a] -> Bool
subconjunto xs ys = 
  [x | x <- xs, x `elem` ys] == xs