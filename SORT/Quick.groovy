def qs(list) {
  if (list.size() < 2) return list   
  def items = list.groupBy { it <=> list[0] }.withDefault { [] }
  qs(items[-1]) + items[0] + qs(items[1])
}


println (qs([23,76,-99,5.8,97,37,85,99,11,38,95,92,24,46,41,24,14,12,57,78,4]))