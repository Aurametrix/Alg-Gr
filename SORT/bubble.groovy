class BubbleSort {
  def list
  def sort() {
    def eachPairIndex = { Collection l ->
      def range = 0..<l.size()
      [range, range.tail()].transpose()
    }
    while (! eachPairIndex(this.list).inject(true) { rslt, idx ->
      if (! (this.list[idx[0]] < this.list[idx[1]]) ) {
        use(Collections){ this.list.swap(idx[0], idx[1]) }
        rslt &= false
      } else rslt
    } );
  }
}

println (BubbleSort([23,76,-99,5.8,97,37,85,99,11,38,95,92,24,46,41,24,14,12,57,78,4]))
