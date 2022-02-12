package tmttyped.std

import tmttyped.std.Intl.RelativeTimeFormatLocaleMatcher
import tmttyped.std.stdStrings.`best fit`
import tmttyped.std.stdStrings.lookup
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait `0` extends StObject {
    
    /* standard es2015.symbol.wellknown */
    @JSName(js.Symbol.replace)
    var replace: js.Function2[
        /* string */ java.lang.String, 
        /* replacer */ js.Function2[/* substring */ java.lang.String, /* repeated */ Any, java.lang.String], 
        java.lang.String
      ] = js.native
  }
  
  trait AcceptNode extends StObject {
    
    /* standard DOM */
    def acceptNode(node: org.scalajs.dom.Node): Double
  }
  object AcceptNode {
    
    @scala.inline
    def apply(acceptNode: org.scalajs.dom.Node => Double): AcceptNode = {
      val __obj = js.Dynamic.literal(acceptNode = js.Any.fromFunction1(acceptNode))
      __obj.asInstanceOf[AcceptNode]
    }
    
    @scala.inline
    implicit class AcceptNodeMutableBuilder[Self <: AcceptNode] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAcceptNode(value: org.scalajs.dom.Node => Double): Self = StObject.set(x, "acceptNode", js.Any.fromFunction1(value))
    }
  }
  
  trait CopyWithin extends StObject {
    
    /* standard es2015.symbol.wellknown */
    var copyWithin: scala.Boolean
    
    /* standard es2015.symbol.wellknown */
    var entries: scala.Boolean
    
    /* standard es2015.symbol.wellknown */
    var fill: scala.Boolean
    
    /* standard es2015.symbol.wellknown */
    var find: scala.Boolean
    
    /* standard es2015.symbol.wellknown */
    var findIndex: scala.Boolean
    
    /* standard es2015.symbol.wellknown */
    var keys: scala.Boolean
    
    /* standard es2015.symbol.wellknown */
    var values: scala.Boolean
  }
  object CopyWithin {
    
    @scala.inline
    def apply(
      copyWithin: scala.Boolean,
      entries: scala.Boolean,
      fill: scala.Boolean,
      find: scala.Boolean,
      findIndex: scala.Boolean,
      keys: scala.Boolean,
      values: scala.Boolean
    ): CopyWithin = {
      val __obj = js.Dynamic.literal(copyWithin = copyWithin.asInstanceOf[js.Any], entries = entries.asInstanceOf[js.Any], fill = fill.asInstanceOf[js.Any], find = find.asInstanceOf[js.Any], findIndex = findIndex.asInstanceOf[js.Any], keys = keys.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
      __obj.asInstanceOf[CopyWithin]
    }
    
    @scala.inline
    implicit class CopyWithinMutableBuilder[Self <: CopyWithin] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCopyWithin(value: scala.Boolean): Self = StObject.set(x, "copyWithin", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEntries(value: scala.Boolean): Self = StObject.set(x, "entries", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFill(value: scala.Boolean): Self = StObject.set(x, "fill", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFind(value: scala.Boolean): Self = StObject.set(x, "find", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFindIndex(value: scala.Boolean): Self = StObject.set(x, "findIndex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeys(value: scala.Boolean): Self = StObject.set(x, "keys", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValues(value: scala.Boolean): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
    }
  }
  
  trait Done[Arr] extends StObject {
    
    /* standard es2019.array */
    var done: Arr
    
    /* standard es2019.array */
    var recur: Arr
  }
  object Done {
    
    @scala.inline
    def apply[Arr](done: Arr, recur: Arr): Done[Arr] = {
      val __obj = js.Dynamic.literal(done = done.asInstanceOf[js.Any], recur = recur.asInstanceOf[js.Any])
      __obj.asInstanceOf[Done[Arr]]
    }
    
    @scala.inline
    implicit class DoneMutableBuilder[Self <: Done[_], Arr] (val x: Self with Done[Arr]) extends AnyVal {
      
      @scala.inline
      def setDone(value: Arr): Self = StObject.set(x, "done", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRecur(value: Arr): Self = StObject.set(x, "recur", value.asInstanceOf[js.Any])
    }
  }
  
  trait Item[T] extends StObject {
    
    /* standard ScriptHost */
    def Item(index: Any): T
  }
  object Item {
    
    @scala.inline
    def apply[T](Item: Any => T): Item[T] = {
      val __obj = js.Dynamic.literal(Item = js.Any.fromFunction1(Item))
      __obj.asInstanceOf[Item[T]]
    }
    
    @scala.inline
    implicit class ItemMutableBuilder[Self <: Item[_], T] (val x: Self with Item[T]) extends AnyVal {
      
      @scala.inline
      def setItem(value: Any => T): Self = StObject.set(x, "Item", js.Any.fromFunction1(value))
    }
  }
  
  trait Length extends StObject {
    
    /* standard ScriptHost */
    def Item(n: Double): java.lang.String
    
    /* standard ScriptHost */
    var length: Double
  }
  object Length {
    
    @scala.inline
    def apply(Item: Double => java.lang.String, length: Double): Length = {
      val __obj = js.Dynamic.literal(Item = js.Any.fromFunction1(Item), length = length.asInstanceOf[js.Any])
      __obj.asInstanceOf[Length]
    }
    
    @scala.inline
    implicit class LengthMutableBuilder[Self <: Length] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setItem(value: Double => java.lang.String): Self = StObject.set(x, "Item", js.Any.fromFunction1(value))
      
      @scala.inline
      def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
    }
  }
  
  trait LocaleMatcher extends StObject {
    
    /* standard es2018.intl */
    var localeMatcher: js.UndefOr[lookup | (`best fit`)] = js.undefined
  }
  object LocaleMatcher {
    
    @scala.inline
    def apply(): LocaleMatcher = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LocaleMatcher]
    }
    
    @scala.inline
    implicit class LocaleMatcherMutableBuilder[Self <: LocaleMatcher] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setLocaleMatcher(value: lookup | (`best fit`)): Self = StObject.set(x, "localeMatcher", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLocaleMatcherUndefined: Self = StObject.set(x, "localeMatcher", js.undefined)
    }
  }
  
  trait LocaleMatcherRelativeTimeFormatLocaleMatcher extends StObject {
    
    /* standard es2020.intl */
    var localeMatcher: RelativeTimeFormatLocaleMatcher
  }
  object LocaleMatcherRelativeTimeFormatLocaleMatcher {
    
    @scala.inline
    def apply(localeMatcher: RelativeTimeFormatLocaleMatcher): LocaleMatcherRelativeTimeFormatLocaleMatcher = {
      val __obj = js.Dynamic.literal(localeMatcher = localeMatcher.asInstanceOf[js.Any])
      __obj.asInstanceOf[LocaleMatcherRelativeTimeFormatLocaleMatcher]
    }
    
    @scala.inline
    implicit class LocaleMatcherRelativeTimeFormatLocaleMatcherMutableBuilder[Self <: LocaleMatcherRelativeTimeFormatLocaleMatcher] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setLocaleMatcher(value: RelativeTimeFormatLocaleMatcher): Self = StObject.set(x, "localeMatcher", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait LookupNamespaceURI extends StObject {
    
    /* standard DOM */
    def lookupNamespaceURI(): java.lang.String | Null = js.native
    def lookupNamespaceURI(prefix: java.lang.String): java.lang.String | Null = js.native
  }
  
  @js.native
  trait Match extends StObject {
    
    /* standard es2015.symbol.wellknown */
    @JSName(js.Symbol.`match`)
    var `match`: js.Function1[/* string */ java.lang.String, RegExpMatchArray | Null] = js.native
  }
  
  trait Proxy[T /* <: js.Object */] extends StObject {
    
    /* standard es2015.proxy */
    var proxy: T
    
    /* standard es2015.proxy */
    def revoke(): Unit
  }
  object Proxy {
    
    @scala.inline
    def apply[T /* <: js.Object */](proxy: T, revoke: () => Unit): Proxy[T] = {
      val __obj = js.Dynamic.literal(proxy = proxy.asInstanceOf[js.Any], revoke = js.Any.fromFunction0(revoke))
      __obj.asInstanceOf[Proxy[T]]
    }
    
    @scala.inline
    implicit class ProxyMutableBuilder[Self <: Proxy[_], T /* <: js.Object */] (val x: Self with Proxy[T]) extends AnyVal {
      
      @scala.inline
      def setProxy(value: T): Self = StObject.set(x, "proxy", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRevoke(value: () => Unit): Self = StObject.set(x, "revoke", js.Any.fromFunction0(value))
    }
  }
  
  trait Raw extends StObject {
    
    /* standard es2015.core */
    var raw: js.Array[java.lang.String] | ArrayLike[java.lang.String]
  }
  object Raw {
    
    @scala.inline
    def apply(raw: js.Array[java.lang.String] | ArrayLike[java.lang.String]): Raw = {
      val __obj = js.Dynamic.literal(raw = raw.asInstanceOf[js.Any])
      __obj.asInstanceOf[Raw]
    }
    
    @scala.inline
    implicit class RawMutableBuilder[Self <: Raw] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setRaw(value: js.Array[java.lang.String] | ArrayLike[java.lang.String]): Self = StObject.set(x, "raw", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRawVarargs(value: java.lang.String*): Self = StObject.set(x, "raw", js.Array(value :_*))
    }
  }
  
  @js.native
  trait Replace extends StObject {
    
    /* standard es2015.symbol.wellknown */
    @JSName(js.Symbol.replace)
    var replace: js.Function2[/* string */ java.lang.String, /* replaceValue */ java.lang.String, java.lang.String] = js.native
  }
  
  @js.native
  trait Search extends StObject {
    
    /* standard es2015.symbol.wellknown */
    @JSName(js.Symbol.search)
    var search: js.Function1[/* string */ java.lang.String, Double] = js.native
  }
  
  @js.native
  trait Split extends StObject {
    
    /* standard es2015.symbol.wellknown */
    @JSName(js.Symbol.split)
    var split: js.Function2[
        /* string */ java.lang.String, 
        /* limit */ js.UndefOr[Double], 
        js.Array[java.lang.String]
      ] = js.native
  }
  
  trait Then extends StObject {
    
    /* standard es5 */
    def `then`(
      onfulfilled: /* import warning: importer.ImportType#apply Failed type conversion: infer F */ js.Any
    ): Any
  }
  object Then {
    
    @scala.inline
    def apply(
      `then`: /* import warning: importer.ImportType#apply Failed type conversion: infer F */ js.Any => Any
    ): Then = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("then")(js.Any.fromFunction1(`then`))
      __obj.asInstanceOf[Then]
    }
    
    @scala.inline
    implicit class ThenMutableBuilder[Self <: Then] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setThen(
        value: /* import warning: importer.ImportType#apply Failed type conversion: infer F */ js.Any => Any
      ): Self = StObject.set(x, "then", js.Any.fromFunction1(value))
    }
  }
}
