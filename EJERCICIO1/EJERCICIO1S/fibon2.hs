for2 :: [a] -> (a -> b -> c -> (b,c)) -> b -> c -> c
for2 []     f _ z = z
for2 (x:xs) f y z = for2 xs f y1 z1
 where (y1,z1) = f x y z
fib :: Int -> Int
fib 0 = 0
fib n = aux (n-1) 0 1 where
 aux n = for2 [1..n] (\k x y -> (y,x+y))