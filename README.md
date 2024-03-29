# カプセル化　　
カプセル化とは抽象化のことであり、無駄を省き、外から見ても複雑でない状態を作ること。  

全てのフィールドをprivateにすることで、外（他のクラス）からフィールドの値を触れないように、見えないようにする。しかし、ただ単に全てのフィールドをprivateにして、全てのフィールドに対してゲッターとセッターを作るだけではカプセル化とは言えない。何かとセッターを作ってしまうと、せっかくprivateにして直接フィールドを触れなくしても意味があまりなくなってしまう。そのため、メソッドを定義しif文などを組み合わせることで、現実的なものになる。

## もう一つの意味　　
カプセル化は中身を守るだけでなく、そのクラス自体（オブジェクト）が完成された一つの部品として働くように設計することが重要。　　
外部との接触点であるpublicなメソッドや、またそのクラス内だけで使うprivateなメソッドによって、カプセルの中のフィールドを完璧に操作できる状態になるようにクラスを設計するのが大事。クラス単体が完璧な設計をしてさえいれば、複数のクラスを作用させて組んだプログラム全体も、完璧な状態になる。
