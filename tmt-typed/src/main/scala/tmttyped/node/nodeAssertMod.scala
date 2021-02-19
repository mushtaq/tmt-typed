package tmttyped.node

import tmttyped.node.anon.Actual
import tmttyped.node.anon.DeepEqual
import tmttyped.node.assertMod.AssertPredicate
import tmttyped.node.nodeStrings.deepEqual
import tmttyped.node.nodeStrings.deepStrictEqual
import tmttyped.node.nodeStrings.equal
import tmttyped.node.nodeStrings.ifError
import tmttyped.node.nodeStrings.notDeepEqual
import tmttyped.node.nodeStrings.notEqual
import tmttyped.node.nodeStrings.ok
import tmttyped.node.nodeStrings.strictEqual
import tmttyped.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object nodeAssertMod {
  
  /** An alias of `assert.ok()`. */
  @JSImport("node:assert", JSImport.Namespace)
  @js.native
  def apply(value: js.Any): /* asserts value */ Boolean = js.native
  @JSImport("node:assert", JSImport.Namespace)
  @js.native
  def apply(value: js.Any, message: java.lang.String): /* asserts value */ Boolean = js.native
  @JSImport("node:assert", JSImport.Namespace)
  @js.native
  def apply(value: js.Any, message: js.Error): /* asserts value */ Boolean = js.native
  
  @JSImport("node:assert", "AssertionError")
  @js.native
  class AssertionError ()
    extends tmttyped.node.assertMod.AssertionError {
    def this(options: Actual) = this()
  }
  
  @JSImport("node:assert", "CallTracker")
  @js.native
  class CallTracker ()
    extends tmttyped.node.assertMod.CallTracker
  
  /** @deprecated since v9.9.0 - use deepStrictEqual() instead. */
  @JSImport("node:assert", "deepEqual")
  @js.native
  def deepEqual(actual: js.Any, expected: js.Any): Unit = js.native
  @JSImport("node:assert", "deepEqual")
  @js.native
  def deepEqual(actual: js.Any, expected: js.Any, message: java.lang.String): Unit = js.native
  @JSImport("node:assert", "deepEqual")
  @js.native
  def deepEqual(actual: js.Any, expected: js.Any, message: js.Error): Unit = js.native
  
  @JSImport("node:assert", "deepStrictEqual")
  @js.native
  def deepStrictEqual[T](actual: js.Any, expected: T): /* asserts actual is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentSimple(T))),IArray())*/ Boolean = js.native
  @JSImport("node:assert", "deepStrictEqual")
  @js.native
  def deepStrictEqual[T](actual: js.Any, expected: T, message: java.lang.String): /* asserts actual is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentSimple(T))),IArray())*/ Boolean = js.native
  @JSImport("node:assert", "deepStrictEqual")
  @js.native
  def deepStrictEqual[T](actual: js.Any, expected: T, message: js.Error): /* asserts actual is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentSimple(T))),IArray())*/ Boolean = js.native
  
  @JSImport("node:assert", "doesNotMatch")
  @js.native
  def doesNotMatch(value: java.lang.String, regExp: js.RegExp): Unit = js.native
  @JSImport("node:assert", "doesNotMatch")
  @js.native
  def doesNotMatch(value: java.lang.String, regExp: js.RegExp, message: java.lang.String): Unit = js.native
  @JSImport("node:assert", "doesNotMatch")
  @js.native
  def doesNotMatch(value: java.lang.String, regExp: js.RegExp, message: js.Error): Unit = js.native
  
  @JSImport("node:assert", "doesNotReject")
  @js.native
  def doesNotReject(block: js.Function0[js.Promise[_]]): js.Promise[Unit] = js.native
  @JSImport("node:assert", "doesNotReject")
  @js.native
  def doesNotReject(block: js.Function0[js.Promise[_]], error: AssertPredicate): js.Promise[Unit] = js.native
  @JSImport("node:assert", "doesNotReject")
  @js.native
  def doesNotReject(block: js.Function0[js.Promise[_]], error: AssertPredicate, message: java.lang.String): js.Promise[Unit] = js.native
  @JSImport("node:assert", "doesNotReject")
  @js.native
  def doesNotReject(block: js.Function0[js.Promise[_]], error: AssertPredicate, message: js.Error): js.Promise[Unit] = js.native
  @JSImport("node:assert", "doesNotReject")
  @js.native
  def doesNotReject(block: js.Function0[js.Promise[_]], message: java.lang.String): js.Promise[Unit] = js.native
  @JSImport("node:assert", "doesNotReject")
  @js.native
  def doesNotReject(block: js.Function0[js.Promise[_]], message: js.Error): js.Promise[Unit] = js.native
  @JSImport("node:assert", "doesNotReject")
  @js.native
  def doesNotReject(block: js.Promise[_]): js.Promise[Unit] = js.native
  @JSImport("node:assert", "doesNotReject")
  @js.native
  def doesNotReject(block: js.Promise[_], error: AssertPredicate): js.Promise[Unit] = js.native
  @JSImport("node:assert", "doesNotReject")
  @js.native
  def doesNotReject(block: js.Promise[_], error: AssertPredicate, message: java.lang.String): js.Promise[Unit] = js.native
  @JSImport("node:assert", "doesNotReject")
  @js.native
  def doesNotReject(block: js.Promise[_], error: AssertPredicate, message: js.Error): js.Promise[Unit] = js.native
  @JSImport("node:assert", "doesNotReject")
  @js.native
  def doesNotReject(block: js.Promise[_], message: java.lang.String): js.Promise[Unit] = js.native
  @JSImport("node:assert", "doesNotReject")
  @js.native
  def doesNotReject(block: js.Promise[_], message: js.Error): js.Promise[Unit] = js.native
  
  @JSImport("node:assert", "doesNotThrow")
  @js.native
  def doesNotThrow(block: js.Function0[_]): Unit = js.native
  @JSImport("node:assert", "doesNotThrow")
  @js.native
  def doesNotThrow(block: js.Function0[_], error: AssertPredicate): Unit = js.native
  @JSImport("node:assert", "doesNotThrow")
  @js.native
  def doesNotThrow(block: js.Function0[_], error: AssertPredicate, message: java.lang.String): Unit = js.native
  @JSImport("node:assert", "doesNotThrow")
  @js.native
  def doesNotThrow(block: js.Function0[_], error: AssertPredicate, message: js.Error): Unit = js.native
  @JSImport("node:assert", "doesNotThrow")
  @js.native
  def doesNotThrow(block: js.Function0[_], message: java.lang.String): Unit = js.native
  @JSImport("node:assert", "doesNotThrow")
  @js.native
  def doesNotThrow(block: js.Function0[_], message: js.Error): Unit = js.native
  
  /** @deprecated since v9.9.0 - use strictEqual() instead. */
  @JSImport("node:assert", "equal")
  @js.native
  def equal(actual: js.Any, expected: js.Any): Unit = js.native
  @JSImport("node:assert", "equal")
  @js.native
  def equal(actual: js.Any, expected: js.Any, message: java.lang.String): Unit = js.native
  @JSImport("node:assert", "equal")
  @js.native
  def equal(actual: js.Any, expected: js.Any, message: js.Error): Unit = js.native
  
  @JSImport("node:assert", "fail")
  @js.native
  def fail(): scala.Nothing = js.native
  /** @deprecated since v10.0.0 - use fail([message]) or other assert functions instead. */
  @JSImport("node:assert", "fail")
  @js.native
  def fail(actual: js.Any, expected: js.Any): scala.Nothing = js.native
  @JSImport("node:assert", "fail")
  @js.native
  def fail(
    actual: js.Any,
    expected: js.Any,
    message: js.UndefOr[scala.Nothing],
    operator: js.UndefOr[scala.Nothing],
    // tslint:disable-next-line:ban-types
  stackStartFn: js.Function
  ): scala.Nothing = js.native
  @JSImport("node:assert", "fail")
  @js.native
  def fail(actual: js.Any, expected: js.Any, message: js.UndefOr[scala.Nothing], operator: java.lang.String): scala.Nothing = js.native
  @JSImport("node:assert", "fail")
  @js.native
  def fail(
    actual: js.Any,
    expected: js.Any,
    message: js.UndefOr[scala.Nothing],
    operator: java.lang.String,
    // tslint:disable-next-line:ban-types
  stackStartFn: js.Function
  ): scala.Nothing = js.native
  @JSImport("node:assert", "fail")
  @js.native
  def fail(actual: js.Any, expected: js.Any, message: java.lang.String): scala.Nothing = js.native
  @JSImport("node:assert", "fail")
  @js.native
  def fail(
    actual: js.Any,
    expected: js.Any,
    message: java.lang.String,
    operator: js.UndefOr[scala.Nothing],
    // tslint:disable-next-line:ban-types
  stackStartFn: js.Function
  ): scala.Nothing = js.native
  @JSImport("node:assert", "fail")
  @js.native
  def fail(actual: js.Any, expected: js.Any, message: java.lang.String, operator: java.lang.String): scala.Nothing = js.native
  @JSImport("node:assert", "fail")
  @js.native
  def fail(
    actual: js.Any,
    expected: js.Any,
    message: java.lang.String,
    operator: java.lang.String,
    // tslint:disable-next-line:ban-types
  stackStartFn: js.Function
  ): scala.Nothing = js.native
  @JSImport("node:assert", "fail")
  @js.native
  def fail(actual: js.Any, expected: js.Any, message: js.Error): scala.Nothing = js.native
  @JSImport("node:assert", "fail")
  @js.native
  def fail(
    actual: js.Any,
    expected: js.Any,
    message: js.Error,
    operator: js.UndefOr[scala.Nothing],
    // tslint:disable-next-line:ban-types
  stackStartFn: js.Function
  ): scala.Nothing = js.native
  @JSImport("node:assert", "fail")
  @js.native
  def fail(actual: js.Any, expected: js.Any, message: js.Error, operator: java.lang.String): scala.Nothing = js.native
  @JSImport("node:assert", "fail")
  @js.native
  def fail(
    actual: js.Any,
    expected: js.Any,
    message: js.Error,
    operator: java.lang.String,
    // tslint:disable-next-line:ban-types
  stackStartFn: js.Function
  ): scala.Nothing = js.native
  @JSImport("node:assert", "fail")
  @js.native
  def fail(message: java.lang.String): scala.Nothing = js.native
  @JSImport("node:assert", "fail")
  @js.native
  def fail(message: js.Error): scala.Nothing = js.native
  
  @JSImport("node:assert", "ifError")
  @js.native
  def ifError(value: js.Any): js.UndefOr[
    /* asserts value is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentSimple(null))),IArray())*/ Boolean
  ] = js.native
  
  /** @deprecated since v9.9.0 - use notDeepStrictEqual() instead. */
  @JSImport("node:assert", "notDeepEqual")
  @js.native
  def notDeepEqual(actual: js.Any, expected: js.Any): Unit = js.native
  @JSImport("node:assert", "notDeepEqual")
  @js.native
  def notDeepEqual(actual: js.Any, expected: js.Any, message: java.lang.String): Unit = js.native
  @JSImport("node:assert", "notDeepEqual")
  @js.native
  def notDeepEqual(actual: js.Any, expected: js.Any, message: js.Error): Unit = js.native
  
  @JSImport("node:assert", "notDeepStrictEqual")
  @js.native
  def notDeepStrictEqual(actual: js.Any, expected: js.Any): Unit = js.native
  @JSImport("node:assert", "notDeepStrictEqual")
  @js.native
  def notDeepStrictEqual(actual: js.Any, expected: js.Any, message: java.lang.String): Unit = js.native
  @JSImport("node:assert", "notDeepStrictEqual")
  @js.native
  def notDeepStrictEqual(actual: js.Any, expected: js.Any, message: js.Error): Unit = js.native
  
  /** @deprecated since v9.9.0 - use notStrictEqual() instead. */
  @JSImport("node:assert", "notEqual")
  @js.native
  def notEqual(actual: js.Any, expected: js.Any): Unit = js.native
  @JSImport("node:assert", "notEqual")
  @js.native
  def notEqual(actual: js.Any, expected: js.Any, message: java.lang.String): Unit = js.native
  @JSImport("node:assert", "notEqual")
  @js.native
  def notEqual(actual: js.Any, expected: js.Any, message: js.Error): Unit = js.native
  
  @JSImport("node:assert", "notStrictEqual")
  @js.native
  def notStrictEqual(actual: js.Any, expected: js.Any): Unit = js.native
  @JSImport("node:assert", "notStrictEqual")
  @js.native
  def notStrictEqual(actual: js.Any, expected: js.Any, message: java.lang.String): Unit = js.native
  @JSImport("node:assert", "notStrictEqual")
  @js.native
  def notStrictEqual(actual: js.Any, expected: js.Any, message: js.Error): Unit = js.native
  
  @JSImport("node:assert", "ok")
  @js.native
  def ok(value: js.Any): /* asserts value */ Boolean = js.native
  @JSImport("node:assert", "ok")
  @js.native
  def ok(value: js.Any, message: java.lang.String): /* asserts value */ Boolean = js.native
  @JSImport("node:assert", "ok")
  @js.native
  def ok(value: js.Any, message: js.Error): /* asserts value */ Boolean = js.native
  
  @JSImport("node:assert", "rejects")
  @js.native
  def rejects(block: js.Function0[js.Promise[_]]): js.Promise[Unit] = js.native
  @JSImport("node:assert", "rejects")
  @js.native
  def rejects(block: js.Function0[js.Promise[_]], error: AssertPredicate): js.Promise[Unit] = js.native
  @JSImport("node:assert", "rejects")
  @js.native
  def rejects(block: js.Function0[js.Promise[_]], error: AssertPredicate, message: java.lang.String): js.Promise[Unit] = js.native
  @JSImport("node:assert", "rejects")
  @js.native
  def rejects(block: js.Function0[js.Promise[_]], error: AssertPredicate, message: js.Error): js.Promise[Unit] = js.native
  @JSImport("node:assert", "rejects")
  @js.native
  def rejects(block: js.Function0[js.Promise[_]], message: java.lang.String): js.Promise[Unit] = js.native
  @JSImport("node:assert", "rejects")
  @js.native
  def rejects(block: js.Function0[js.Promise[_]], message: js.Error): js.Promise[Unit] = js.native
  @JSImport("node:assert", "rejects")
  @js.native
  def rejects(block: js.Promise[_]): js.Promise[Unit] = js.native
  @JSImport("node:assert", "rejects")
  @js.native
  def rejects(block: js.Promise[_], error: AssertPredicate): js.Promise[Unit] = js.native
  @JSImport("node:assert", "rejects")
  @js.native
  def rejects(block: js.Promise[_], error: AssertPredicate, message: java.lang.String): js.Promise[Unit] = js.native
  @JSImport("node:assert", "rejects")
  @js.native
  def rejects(block: js.Promise[_], error: AssertPredicate, message: js.Error): js.Promise[Unit] = js.native
  @JSImport("node:assert", "rejects")
  @js.native
  def rejects(block: js.Promise[_], message: java.lang.String): js.Promise[Unit] = js.native
  @JSImport("node:assert", "rejects")
  @js.native
  def rejects(block: js.Promise[_], message: js.Error): js.Promise[Unit] = js.native
  
  @JSImport("node:assert", "strict")
  @js.native
  val strict: (Omit[
    /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof assert */ _, 
    equal | notEqual | deepEqual | notDeepEqual | ok | strictEqual | deepStrictEqual | ifError | tmttyped.node.nodeStrings.strict
  ]) with DeepEqual = js.native
  
  @JSImport("node:assert", "strictEqual")
  @js.native
  def strictEqual[T](actual: js.Any, expected: T): /* asserts actual is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentSimple(T))),IArray())*/ Boolean = js.native
  @JSImport("node:assert", "strictEqual")
  @js.native
  def strictEqual[T](actual: js.Any, expected: T, message: java.lang.String): /* asserts actual is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentSimple(T))),IArray())*/ Boolean = js.native
  @JSImport("node:assert", "strictEqual")
  @js.native
  def strictEqual[T](actual: js.Any, expected: T, message: js.Error): /* asserts actual is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentSimple(T))),IArray())*/ Boolean = js.native
  
  @JSImport("node:assert", "throws")
  @js.native
  def throws(block: js.Function0[_]): Unit = js.native
  @JSImport("node:assert", "throws")
  @js.native
  def throws(block: js.Function0[_], error: AssertPredicate): Unit = js.native
  @JSImport("node:assert", "throws")
  @js.native
  def throws(block: js.Function0[_], error: AssertPredicate, message: java.lang.String): Unit = js.native
  @JSImport("node:assert", "throws")
  @js.native
  def throws(block: js.Function0[_], error: AssertPredicate, message: js.Error): Unit = js.native
  @JSImport("node:assert", "throws")
  @js.native
  def throws(block: js.Function0[_], message: java.lang.String): Unit = js.native
  @JSImport("node:assert", "throws")
  @js.native
  def throws(block: js.Function0[_], message: js.Error): Unit = js.native
  
  @JSImport("node:assert", "match")
  @js.native
  def `match`(value: java.lang.String, regExp: js.RegExp): Unit = js.native
  @JSImport("node:assert", "match")
  @js.native
  def `match`(value: java.lang.String, regExp: js.RegExp, message: java.lang.String): Unit = js.native
  @JSImport("node:assert", "match")
  @js.native
  def `match`(value: java.lang.String, regExp: js.RegExp, message: js.Error): Unit = js.native
}
