package tmttyped.rsocketTypes

import tmttyped.rsocketTypes.reactiveSocketTypesMod.ConnectionStatus
import tmttyped.rsocketTypes.rsocketTypesStrings.CLOSED
import tmttyped.rsocketTypes.rsocketTypesStrings.CONNECTED
import tmttyped.rsocketTypes.rsocketTypesStrings.CONNECTING
import tmttyped.rsocketTypes.rsocketTypesStrings.ERROR
import tmttyped.rsocketTypes.rsocketTypesStrings.NOT_CONNECTED
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait `0` extends ConnectionStatus {
    
    var kind: CONNECTING
  }
  object `0` {
    
    @scala.inline
    def apply(kind: CONNECTING): `0` = {
      val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any])
      __obj.asInstanceOf[`0`]
    }
    
    @scala.inline
    implicit class `0MutableBuilder`[Self <: `0`] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setKind(value: CONNECTING): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    }
  }
  
  trait `1` extends ConnectionStatus {
    
    var kind: CONNECTED
  }
  object `1` {
    
    @scala.inline
    def apply(kind: CONNECTED): `1` = {
      val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any])
      __obj.asInstanceOf[`1`]
    }
    
    @scala.inline
    implicit class `1MutableBuilder`[Self <: `1`] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setKind(value: CONNECTED): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    }
  }
  
  trait `2` extends ConnectionStatus {
    
    var kind: CLOSED
  }
  object `2` {
    
    @scala.inline
    def apply(kind: CLOSED): `2` = {
      val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any])
      __obj.asInstanceOf[`2`]
    }
    
    @scala.inline
    implicit class `2MutableBuilder`[Self <: `2`] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setKind(value: CLOSED): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    }
  }
  
  trait Error extends ConnectionStatus {
    
    var error: js.Error
    
    var kind: ERROR
  }
  object Error {
    
    @scala.inline
    def apply(error: js.Error, kind: ERROR): Error = {
      val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any])
      __obj.asInstanceOf[Error]
    }
    
    @scala.inline
    implicit class ErrorMutableBuilder[Self <: Error] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setError(value: js.Error): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKind(value: ERROR): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    }
  }
  
  trait Kind extends ConnectionStatus {
    
    var kind: NOT_CONNECTED
  }
  object Kind {
    
    @scala.inline
    def apply(kind: NOT_CONNECTED): Kind = {
      val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any])
      __obj.asInstanceOf[Kind]
    }
    
    @scala.inline
    implicit class KindMutableBuilder[Self <: Kind] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setKind(value: NOT_CONNECTED): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    }
  }
}