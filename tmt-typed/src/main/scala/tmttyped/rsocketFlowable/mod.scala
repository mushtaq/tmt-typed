package tmttyped.rsocketFlowable

import tmttyped.rsocketFlowable.flowableMod.Source
import tmttyped.rsocketFlowable.flowableMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("rsocket-flowable", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("rsocket-flowable", "Flowable")
  @js.native
  class Flowable[T] protected () extends default[T] {
    def this(source: Source[T]) = this()
    def this(source: Source[T], max: Double) = this()
  }
  /* static members */
  object Flowable {
    
    @JSImport("rsocket-flowable", "Flowable")
    @js.native
    val ^ : js.Any = js.native
    
    @scala.inline
    def error(error: js.Error): tmttyped.rsocketFlowable.flowableMod.Flowable[scala.Nothing] = ^.asInstanceOf[js.Dynamic].applyDynamic("error")(error.asInstanceOf[js.Any]).asInstanceOf[tmttyped.rsocketFlowable.flowableMod.Flowable[scala.Nothing]]
    
    @scala.inline
    def just[U](values: U*): tmttyped.rsocketFlowable.flowableMod.Flowable[U] = ^.asInstanceOf[js.Dynamic].applyDynamic("just")(values.asInstanceOf[js.Any]).asInstanceOf[tmttyped.rsocketFlowable.flowableMod.Flowable[U]]
    
    @scala.inline
    def never(): tmttyped.rsocketFlowable.flowableMod.Flowable[scala.Nothing] = ^.asInstanceOf[js.Dynamic].applyDynamic("never")().asInstanceOf[tmttyped.rsocketFlowable.flowableMod.Flowable[scala.Nothing]]
  }
  
  @JSImport("rsocket-flowable", "FlowableProcessor")
  @js.native
  class FlowableProcessor[T, R] protected ()
    extends tmttyped.rsocketFlowable.flowableProcessorMod.default[T, R] {
    def this(source: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify IPublisher<T> */ js.Any) = this()
    def this(
      source: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify IPublisher<T> */ js.Any,
      fn: js.Function1[/* a */ T, R]
    ) = this()
  }
  
  @JSImport("rsocket-flowable", "Single")
  @js.native
  class Single[T] protected ()
    extends tmttyped.rsocketFlowable.singleMod.default[T] {
    def this(source: tmttyped.rsocketFlowable.singleMod.Source[T]) = this()
  }
  /* static members */
  object Single {
    
    @JSImport("rsocket-flowable", "Single")
    @js.native
    val ^ : js.Any = js.native
    
    @scala.inline
    def error(error: js.Error): tmttyped.rsocketFlowable.singleMod.Single[scala.Nothing] = ^.asInstanceOf[js.Dynamic].applyDynamic("error")(error.asInstanceOf[js.Any]).asInstanceOf[tmttyped.rsocketFlowable.singleMod.Single[scala.Nothing]]
    
    @scala.inline
    def never(): tmttyped.rsocketFlowable.singleMod.Single[scala.Nothing] = ^.asInstanceOf[js.Dynamic].applyDynamic("never")().asInstanceOf[tmttyped.rsocketFlowable.singleMod.Single[scala.Nothing]]
    
    @scala.inline
    def of[U](value: U): tmttyped.rsocketFlowable.singleMod.Single[U] = ^.asInstanceOf[js.Dynamic].applyDynamic("of")(value.asInstanceOf[js.Any]).asInstanceOf[tmttyped.rsocketFlowable.singleMod.Single[U]]
  }
  
  @scala.inline
  def every(ms: Double): default[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("every")(ms.asInstanceOf[js.Any]).asInstanceOf[default[Double]]
}
