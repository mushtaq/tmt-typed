package tmttyped

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object node {
  
  type NodeModule = tmttyped.node.NodeJS.Module
  
  /*-----------------------------------------------*
    *                                               *
    *                   GLOBAL                      *
    *                                               *
    ------------------------------------------------*/
  // For backwards compability
  type NodeRequire = tmttyped.node.NodeJS.Require
  
  type RequireResolve = tmttyped.node.NodeJS.RequireResolve
  
  type WithImplicitCoercion[T] = T | tmttyped.node.anon.ValueOf[T]
}
