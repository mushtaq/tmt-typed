package tmttyped.node

import tmttyped.node.anon.encodingBufferEncodingExe
import tmttyped.node.anon.encodingbuffernullExecOpt
import tmttyped.node.childProcessMod.ChildProcess
import tmttyped.node.childProcessMod.ChildProcessByStdio
import tmttyped.node.childProcessMod.ChildProcessWithoutNullStreams
import tmttyped.node.childProcessMod.ExecException
import tmttyped.node.childProcessMod.ExecFileOptions
import tmttyped.node.childProcessMod.ExecFileOptionsWithBufferEncoding
import tmttyped.node.childProcessMod.ExecFileOptionsWithOtherEncoding
import tmttyped.node.childProcessMod.ExecFileOptionsWithStringEncoding
import tmttyped.node.childProcessMod.ExecFileSyncOptions
import tmttyped.node.childProcessMod.ExecFileSyncOptionsWithBufferEncoding
import tmttyped.node.childProcessMod.ExecFileSyncOptionsWithStringEncoding
import tmttyped.node.childProcessMod.ExecOptions
import tmttyped.node.childProcessMod.ExecSyncOptions
import tmttyped.node.childProcessMod.ExecSyncOptionsWithBufferEncoding
import tmttyped.node.childProcessMod.ExecSyncOptionsWithStringEncoding
import tmttyped.node.childProcessMod.ForkOptions
import tmttyped.node.childProcessMod.SpawnOptions
import tmttyped.node.childProcessMod.SpawnOptionsWithStdioTuple
import tmttyped.node.childProcessMod.SpawnOptionsWithoutStdio
import tmttyped.node.childProcessMod.SpawnSyncOptions
import tmttyped.node.childProcessMod.SpawnSyncOptionsWithBufferEncoding
import tmttyped.node.childProcessMod.SpawnSyncOptionsWithStringEncoding
import tmttyped.node.childProcessMod.SpawnSyncReturns
import tmttyped.node.childProcessMod.StdioNull
import tmttyped.node.childProcessMod.StdioPipe
import tmttyped.node.fsMod.BaseEncodingOptions
import tmttyped.node.nodeStreamMod.Readable
import tmttyped.node.nodeStreamMod.Writable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object nodeChildProcessMod {
  
  // no `options` definitely means stdout/stderr are `string`.
  // NOTE: This namespace provides design-time support for util.promisify. Exported members do not exist at runtime.
  // fallback if nothing else matches. Worst case is always `string | Buffer`.
  @JSImport("node:child_process", "exec")
  @js.native
  def exec(command: java.lang.String): ChildProcess = js.native
  // NOTE: This namespace provides design-time support for util.promisify. Exported members do not exist at runtime.
  @JSImport("node:child_process", "exec")
  @js.native
  def exec(
    command: java.lang.String,
    callback: js.Function3[
      /* error */ ExecException | Null, 
      /* stdout */ java.lang.String, 
      /* stderr */ java.lang.String, 
      Unit
    ]
  ): ChildProcess = js.native
  // NOTE: This namespace provides design-time support for util.promisify. Exported members do not exist at runtime.
  @JSImport("node:child_process", "exec")
  @js.native
  def exec(command: java.lang.String, options: BaseEncodingOptions with ExecOptions): ChildProcess = js.native
  // NOTE: This namespace provides design-time support for util.promisify. Exported members do not exist at runtime.
  @JSImport("node:child_process", "exec")
  @js.native
  def exec(
    command: java.lang.String,
    options: BaseEncodingOptions with ExecOptions,
    callback: js.Function3[
      /* error */ ExecException | Null, 
      /* stdout */ java.lang.String | Buffer, 
      /* stderr */ java.lang.String | Buffer, 
      Unit
    ]
  ): ChildProcess = js.native
  // NOTE: This namespace provides design-time support for util.promisify. Exported members do not exist at runtime.
  @JSImport("node:child_process", "exec")
  @js.native
  def exec(
    command: java.lang.String,
    options: js.UndefOr[scala.Nothing],
    callback: js.Function3[
      /* error */ ExecException | Null, 
      /* stdout */ java.lang.String | Buffer, 
      /* stderr */ java.lang.String | Buffer, 
      Unit
    ]
  ): ChildProcess = js.native
  // NOTE: This namespace provides design-time support for util.promisify. Exported members do not exist at runtime.
  @JSImport("node:child_process", "exec")
  @js.native
  def exec(
    command: java.lang.String,
    options: Null,
    callback: js.Function3[
      /* error */ ExecException | Null, 
      /* stdout */ java.lang.String | Buffer, 
      /* stderr */ java.lang.String | Buffer, 
      Unit
    ]
  ): ChildProcess = js.native
  // `options` with well known `encoding` means stdout/stderr are definitely `string`.
  // NOTE: This namespace provides design-time support for util.promisify. Exported members do not exist at runtime.
  // `options` with an `encoding` whose type is `string` means stdout/stderr could either be `Buffer` or `string`.
  // There is no guarantee the `encoding` is unknown as `string` is a superset of `BufferEncoding`.
  @JSImport("node:child_process", "exec")
  @js.native
  def exec(command: java.lang.String, options: encodingBufferEncodingExe): ChildProcess = js.native
  // NOTE: This namespace provides design-time support for util.promisify. Exported members do not exist at runtime.
  @JSImport("node:child_process", "exec")
  @js.native
  def exec(
    command: java.lang.String,
    options: encodingBufferEncodingExe,
    callback: js.Function3[
      ExecException | Null, 
      Buffer | (/* stdout */ java.lang.String), 
      Buffer | (/* stderr */ java.lang.String), 
      Unit
    ]
  ): ChildProcess = js.native
  // `options` with `"buffer"` or `null` for `encoding` means stdout/stderr are definitely `Buffer`.
  // NOTE: This namespace provides design-time support for util.promisify. Exported members do not exist at runtime.
  @JSImport("node:child_process", "exec")
  @js.native
  def exec(command: java.lang.String, options: encodingbuffernullExecOpt): ChildProcess = js.native
  // NOTE: This namespace provides design-time support for util.promisify. Exported members do not exist at runtime.
  @JSImport("node:child_process", "exec")
  @js.native
  def exec(
    command: java.lang.String,
    options: encodingbuffernullExecOpt,
    callback: js.Function3[/* error */ ExecException | Null, /* stdout */ Buffer, /* stderr */ Buffer, Unit]
  ): ChildProcess = js.native
  // `options` without an `encoding` means stdout/stderr are definitely `string`.
  // NOTE: This namespace provides design-time support for util.promisify. Exported members do not exist at runtime.
  @JSImport("node:child_process", "exec")
  @js.native
  def exec(command: java.lang.String, options: ExecOptions): ChildProcess = js.native
  // NOTE: This namespace provides design-time support for util.promisify. Exported members do not exist at runtime.
  @JSImport("node:child_process", "exec")
  @js.native
  def exec(
    command: java.lang.String,
    options: ExecOptions,
    callback: js.Function3[
      /* error */ ExecException | Null, 
      /* stdout */ java.lang.String, 
      /* stderr */ java.lang.String, 
      Unit
    ]
  ): ChildProcess = js.native
  
  // NOTE: This namespace provides design-time support for util.promisify. Exported members do not exist at runtime.
  // fallback if nothing else matches. Worst case is always `string | Buffer`.
  @JSImport("node:child_process", "execFile")
  @js.native
  def execFile(file: java.lang.String): ChildProcess = js.native
  // NOTE: This namespace provides design-time support for util.promisify. Exported members do not exist at runtime.
  @JSImport("node:child_process", "execFile")
  @js.native
  def execFile(
    file: java.lang.String,
    args: js.UndefOr[scala.Nothing],
    callback: js.Function3[
      ExecException | Null, 
      Buffer | (/* stdout */ java.lang.String), 
      Buffer | (/* stderr */ java.lang.String), 
      Unit
    ]
  ): ChildProcess = js.native
  // NOTE: This namespace provides design-time support for util.promisify. Exported members do not exist at runtime.
  @JSImport("node:child_process", "execFile")
  @js.native
  def execFile(
    file: java.lang.String,
    args: js.UndefOr[scala.Nothing],
    options: BaseEncodingOptions with ExecFileOptions
  ): ChildProcess = js.native
  // NOTE: This namespace provides design-time support for util.promisify. Exported members do not exist at runtime.
  @JSImport("node:child_process", "execFile")
  @js.native
  def execFile(
    file: java.lang.String,
    args: js.UndefOr[scala.Nothing],
    options: BaseEncodingOptions with ExecFileOptions,
    callback: js.Function3[
      /* error */ ExecException | Null, 
      /* stdout */ java.lang.String | Buffer, 
      /* stderr */ java.lang.String | Buffer, 
      Unit
    ]
  ): ChildProcess = js.native
  // NOTE: This namespace provides design-time support for util.promisify. Exported members do not exist at runtime.
  @JSImport("node:child_process", "execFile")
  @js.native
  def execFile(
    file: java.lang.String,
    args: js.UndefOr[scala.Nothing],
    options: js.UndefOr[scala.Nothing],
    callback: js.Function3[
      /* error */ ExecException | Null, 
      /* stdout */ java.lang.String | Buffer, 
      /* stderr */ java.lang.String | Buffer, 
      Unit
    ]
  ): ChildProcess = js.native
  // NOTE: This namespace provides design-time support for util.promisify. Exported members do not exist at runtime.
  @JSImport("node:child_process", "execFile")
  @js.native
  def execFile(
    file: java.lang.String,
    args: js.UndefOr[scala.Nothing],
    options: Null,
    callback: js.Function3[
      /* error */ ExecException | Null, 
      /* stdout */ java.lang.String | Buffer, 
      /* stderr */ java.lang.String | Buffer, 
      Unit
    ]
  ): ChildProcess = js.native
  // NOTE: This namespace provides design-time support for util.promisify. Exported members do not exist at runtime.
  @JSImport("node:child_process", "execFile")
  @js.native
  def execFile(
    file: java.lang.String,
    args: js.UndefOr[scala.Nothing],
    options: ExecFileOptionsWithBufferEncoding,
    callback: js.Function3[/* error */ ExecException | Null, /* stdout */ Buffer, /* stderr */ Buffer, Unit]
  ): ChildProcess = js.native
  // NOTE: This namespace provides design-time support for util.promisify. Exported members do not exist at runtime.
  @JSImport("node:child_process", "execFile")
  @js.native
  def execFile(
    file: java.lang.String,
    args: js.UndefOr[scala.Nothing],
    options: ExecFileOptionsWithOtherEncoding,
    callback: js.Function3[
      /* error */ ExecException | Null, 
      /* stdout */ java.lang.String | Buffer, 
      /* stderr */ java.lang.String | Buffer, 
      Unit
    ]
  ): ChildProcess = js.native
  // NOTE: This namespace provides design-time support for util.promisify. Exported members do not exist at runtime.
  @JSImport("node:child_process", "execFile")
  @js.native
  def execFile(
    file: java.lang.String,
    args: js.UndefOr[scala.Nothing],
    options: ExecFileOptionsWithStringEncoding,
    callback: js.Function3[
      /* error */ ExecException | Null, 
      /* stdout */ java.lang.String, 
      /* stderr */ java.lang.String, 
      Unit
    ]
  ): ChildProcess = js.native
  // NOTE: This namespace provides design-time support for util.promisify. Exported members do not exist at runtime.
  @JSImport("node:child_process", "execFile")
  @js.native
  def execFile(
    file: java.lang.String,
    args: js.UndefOr[scala.Nothing],
    options: ExecFileOptions,
    callback: js.Function3[
      /* error */ ExecException | Null, 
      /* stdout */ java.lang.String, 
      /* stderr */ java.lang.String, 
      Unit
    ]
  ): ChildProcess = js.native
  // NOTE: This namespace provides design-time support for util.promisify. Exported members do not exist at runtime.
  @JSImport("node:child_process", "execFile")
  @js.native
  def execFile(file: java.lang.String, args: js.Array[java.lang.String]): ChildProcess = js.native
  // NOTE: This namespace provides design-time support for util.promisify. Exported members do not exist at runtime.
  @JSImport("node:child_process", "execFile")
  @js.native
  def execFile(
    file: java.lang.String,
    args: js.Array[java.lang.String],
    callback: js.Function3[
      /* error */ ExecException | Null, 
      /* stdout */ java.lang.String, 
      /* stderr */ java.lang.String, 
      Unit
    ]
  ): ChildProcess = js.native
  // NOTE: This namespace provides design-time support for util.promisify. Exported members do not exist at runtime.
  @JSImport("node:child_process", "execFile")
  @js.native
  def execFile(
    file: java.lang.String,
    args: js.Array[java.lang.String],
    options: BaseEncodingOptions with ExecFileOptions
  ): ChildProcess = js.native
  // NOTE: This namespace provides design-time support for util.promisify. Exported members do not exist at runtime.
  @JSImport("node:child_process", "execFile")
  @js.native
  def execFile(
    file: java.lang.String,
    args: js.Array[java.lang.String],
    options: BaseEncodingOptions with ExecFileOptions,
    callback: js.Function3[
      /* error */ ExecException | Null, 
      /* stdout */ java.lang.String | Buffer, 
      /* stderr */ java.lang.String | Buffer, 
      Unit
    ]
  ): ChildProcess = js.native
  // NOTE: This namespace provides design-time support for util.promisify. Exported members do not exist at runtime.
  @JSImport("node:child_process", "execFile")
  @js.native
  def execFile(
    file: java.lang.String,
    args: js.Array[java.lang.String],
    options: js.UndefOr[scala.Nothing],
    callback: js.Function3[
      /* error */ ExecException | Null, 
      /* stdout */ java.lang.String | Buffer, 
      /* stderr */ java.lang.String | Buffer, 
      Unit
    ]
  ): ChildProcess = js.native
  // NOTE: This namespace provides design-time support for util.promisify. Exported members do not exist at runtime.
  @JSImport("node:child_process", "execFile")
  @js.native
  def execFile(
    file: java.lang.String,
    args: js.Array[java.lang.String],
    options: Null,
    callback: js.Function3[
      /* error */ ExecException | Null, 
      /* stdout */ java.lang.String | Buffer, 
      /* stderr */ java.lang.String | Buffer, 
      Unit
    ]
  ): ChildProcess = js.native
  // NOTE: This namespace provides design-time support for util.promisify. Exported members do not exist at runtime.
  @JSImport("node:child_process", "execFile")
  @js.native
  def execFile(
    file: java.lang.String,
    args: js.Array[java.lang.String],
    options: ExecFileOptionsWithBufferEncoding,
    callback: js.Function3[/* error */ ExecException | Null, /* stdout */ Buffer, /* stderr */ Buffer, Unit]
  ): ChildProcess = js.native
  // NOTE: This namespace provides design-time support for util.promisify. Exported members do not exist at runtime.
  @JSImport("node:child_process", "execFile")
  @js.native
  def execFile(
    file: java.lang.String,
    args: js.Array[java.lang.String],
    options: ExecFileOptionsWithOtherEncoding,
    callback: js.Function3[
      /* error */ ExecException | Null, 
      /* stdout */ java.lang.String | Buffer, 
      /* stderr */ java.lang.String | Buffer, 
      Unit
    ]
  ): ChildProcess = js.native
  // NOTE: This namespace provides design-time support for util.promisify. Exported members do not exist at runtime.
  @JSImport("node:child_process", "execFile")
  @js.native
  def execFile(
    file: java.lang.String,
    args: js.Array[java.lang.String],
    options: ExecFileOptionsWithStringEncoding,
    callback: js.Function3[
      /* error */ ExecException | Null, 
      /* stdout */ java.lang.String, 
      /* stderr */ java.lang.String, 
      Unit
    ]
  ): ChildProcess = js.native
  // NOTE: This namespace provides design-time support for util.promisify. Exported members do not exist at runtime.
  @JSImport("node:child_process", "execFile")
  @js.native
  def execFile(
    file: java.lang.String,
    args: js.Array[java.lang.String],
    options: ExecFileOptions,
    callback: js.Function3[
      /* error */ ExecException | Null, 
      /* stdout */ java.lang.String, 
      /* stderr */ java.lang.String, 
      Unit
    ]
  ): ChildProcess = js.native
  // NOTE: This namespace provides design-time support for util.promisify. Exported members do not exist at runtime.
  @JSImport("node:child_process", "execFile")
  @js.native
  def execFile(
    file: java.lang.String,
    args: Null,
    callback: js.Function3[
      ExecException | Null, 
      Buffer | (/* stdout */ java.lang.String), 
      Buffer | (/* stderr */ java.lang.String), 
      Unit
    ]
  ): ChildProcess = js.native
  // NOTE: This namespace provides design-time support for util.promisify. Exported members do not exist at runtime.
  @JSImport("node:child_process", "execFile")
  @js.native
  def execFile(file: java.lang.String, args: Null, options: BaseEncodingOptions with ExecFileOptions): ChildProcess = js.native
  // NOTE: This namespace provides design-time support for util.promisify. Exported members do not exist at runtime.
  @JSImport("node:child_process", "execFile")
  @js.native
  def execFile(
    file: java.lang.String,
    args: Null,
    options: BaseEncodingOptions with ExecFileOptions,
    callback: js.Function3[
      /* error */ ExecException | Null, 
      /* stdout */ java.lang.String | Buffer, 
      /* stderr */ java.lang.String | Buffer, 
      Unit
    ]
  ): ChildProcess = js.native
  // NOTE: This namespace provides design-time support for util.promisify. Exported members do not exist at runtime.
  @JSImport("node:child_process", "execFile")
  @js.native
  def execFile(
    file: java.lang.String,
    args: Null,
    options: js.UndefOr[scala.Nothing],
    callback: js.Function3[
      /* error */ ExecException | Null, 
      /* stdout */ java.lang.String | Buffer, 
      /* stderr */ java.lang.String | Buffer, 
      Unit
    ]
  ): ChildProcess = js.native
  // NOTE: This namespace provides design-time support for util.promisify. Exported members do not exist at runtime.
  @JSImport("node:child_process", "execFile")
  @js.native
  def execFile(
    file: java.lang.String,
    args: Null,
    options: Null,
    callback: js.Function3[
      /* error */ ExecException | Null, 
      /* stdout */ java.lang.String | Buffer, 
      /* stderr */ java.lang.String | Buffer, 
      Unit
    ]
  ): ChildProcess = js.native
  // NOTE: This namespace provides design-time support for util.promisify. Exported members do not exist at runtime.
  @JSImport("node:child_process", "execFile")
  @js.native
  def execFile(
    file: java.lang.String,
    args: Null,
    options: ExecFileOptionsWithBufferEncoding,
    callback: js.Function3[/* error */ ExecException | Null, /* stdout */ Buffer, /* stderr */ Buffer, Unit]
  ): ChildProcess = js.native
  // NOTE: This namespace provides design-time support for util.promisify. Exported members do not exist at runtime.
  @JSImport("node:child_process", "execFile")
  @js.native
  def execFile(
    file: java.lang.String,
    args: Null,
    options: ExecFileOptionsWithOtherEncoding,
    callback: js.Function3[
      /* error */ ExecException | Null, 
      /* stdout */ java.lang.String | Buffer, 
      /* stderr */ java.lang.String | Buffer, 
      Unit
    ]
  ): ChildProcess = js.native
  // NOTE: This namespace provides design-time support for util.promisify. Exported members do not exist at runtime.
  @JSImport("node:child_process", "execFile")
  @js.native
  def execFile(
    file: java.lang.String,
    args: Null,
    options: ExecFileOptionsWithStringEncoding,
    callback: js.Function3[
      /* error */ ExecException | Null, 
      /* stdout */ java.lang.String, 
      /* stderr */ java.lang.String, 
      Unit
    ]
  ): ChildProcess = js.native
  // NOTE: This namespace provides design-time support for util.promisify. Exported members do not exist at runtime.
  @JSImport("node:child_process", "execFile")
  @js.native
  def execFile(
    file: java.lang.String,
    args: Null,
    options: ExecFileOptions,
    callback: js.Function3[
      /* error */ ExecException | Null, 
      /* stdout */ java.lang.String, 
      /* stderr */ java.lang.String, 
      Unit
    ]
  ): ChildProcess = js.native
  // no `options` definitely means stdout/stderr are `string`.
  // NOTE: This namespace provides design-time support for util.promisify. Exported members do not exist at runtime.
  @JSImport("node:child_process", "execFile")
  @js.native
  def execFile(
    file: java.lang.String,
    callback: js.Function3[
      /* error */ ExecException | Null, 
      /* stdout */ java.lang.String, 
      /* stderr */ java.lang.String, 
      Unit
    ]
  ): ChildProcess = js.native
  // NOTE: This namespace provides design-time support for util.promisify. Exported members do not exist at runtime.
  @JSImport("node:child_process", "execFile")
  @js.native
  def execFile(file: java.lang.String, options: BaseEncodingOptions with ExecFileOptions): ChildProcess = js.native
  // NOTE: This namespace provides design-time support for util.promisify. Exported members do not exist at runtime.
  @JSImport("node:child_process", "execFile")
  @js.native
  def execFile(
    file: java.lang.String,
    options: BaseEncodingOptions with ExecFileOptions,
    callback: js.Function3[
      /* error */ ExecException | Null, 
      /* stdout */ java.lang.String | Buffer, 
      /* stderr */ java.lang.String | Buffer, 
      Unit
    ]
  ): ChildProcess = js.native
  // `options` with `"buffer"` or `null` for `encoding` means stdout/stderr are definitely `Buffer`.
  // NOTE: This namespace provides design-time support for util.promisify. Exported members do not exist at runtime.
  @JSImport("node:child_process", "execFile")
  @js.native
  def execFile(
    file: java.lang.String,
    options: ExecFileOptionsWithBufferEncoding,
    callback: js.Function3[/* error */ ExecException | Null, /* stdout */ Buffer, /* stderr */ Buffer, Unit]
  ): ChildProcess = js.native
  // `options` with an `encoding` whose type is `string` means stdout/stderr could either be `Buffer` or `string`.
  // There is no guarantee the `encoding` is unknown as `string` is a superset of `BufferEncoding`.
  // NOTE: This namespace provides design-time support for util.promisify. Exported members do not exist at runtime.
  @JSImport("node:child_process", "execFile")
  @js.native
  def execFile(
    file: java.lang.String,
    options: ExecFileOptionsWithOtherEncoding,
    callback: js.Function3[
      /* error */ ExecException | Null, 
      /* stdout */ java.lang.String | Buffer, 
      /* stderr */ java.lang.String | Buffer, 
      Unit
    ]
  ): ChildProcess = js.native
  // `options` with well known `encoding` means stdout/stderr are definitely `string`.
  // NOTE: This namespace provides design-time support for util.promisify. Exported members do not exist at runtime.
  @JSImport("node:child_process", "execFile")
  @js.native
  def execFile(
    file: java.lang.String,
    options: ExecFileOptionsWithStringEncoding,
    callback: js.Function3[
      /* error */ ExecException | Null, 
      /* stdout */ java.lang.String, 
      /* stderr */ java.lang.String, 
      Unit
    ]
  ): ChildProcess = js.native
  // `options` without an `encoding` means stdout/stderr are definitely `string`.
  // NOTE: This namespace provides design-time support for util.promisify. Exported members do not exist at runtime.
  @JSImport("node:child_process", "execFile")
  @js.native
  def execFile(
    file: java.lang.String,
    options: ExecFileOptions,
    callback: js.Function3[
      /* error */ ExecException | Null, 
      /* stdout */ java.lang.String, 
      /* stderr */ java.lang.String, 
      Unit
    ]
  ): ChildProcess = js.native
  
  @JSImport("node:child_process", "execFileSync")
  @js.native
  def execFileSync(command: java.lang.String): Buffer = js.native
  @JSImport("node:child_process", "execFileSync")
  @js.native
  def execFileSync(command: java.lang.String, args: js.UndefOr[scala.Nothing], options: ExecFileSyncOptions): Buffer = js.native
  @JSImport("node:child_process", "execFileSync")
  @js.native
  def execFileSync(
    command: java.lang.String,
    args: js.UndefOr[scala.Nothing],
    options: ExecFileSyncOptionsWithBufferEncoding
  ): Buffer = js.native
  @JSImport("node:child_process", "execFileSync")
  @js.native
  def execFileSync(
    command: java.lang.String,
    args: js.UndefOr[scala.Nothing],
    options: ExecFileSyncOptionsWithStringEncoding
  ): java.lang.String = js.native
  @JSImport("node:child_process", "execFileSync")
  @js.native
  def execFileSync(command: java.lang.String, args: js.Array[java.lang.String]): Buffer = js.native
  @JSImport("node:child_process", "execFileSync")
  @js.native
  def execFileSync(command: java.lang.String, args: js.Array[java.lang.String], options: ExecFileSyncOptions): Buffer = js.native
  @JSImport("node:child_process", "execFileSync")
  @js.native
  def execFileSync(
    command: java.lang.String,
    args: js.Array[java.lang.String],
    options: ExecFileSyncOptionsWithBufferEncoding
  ): Buffer = js.native
  @JSImport("node:child_process", "execFileSync")
  @js.native
  def execFileSync(
    command: java.lang.String,
    args: js.Array[java.lang.String],
    options: ExecFileSyncOptionsWithStringEncoding
  ): java.lang.String = js.native
  @JSImport("node:child_process", "execFileSync")
  @js.native
  def execFileSync(command: java.lang.String, options: ExecFileSyncOptions): Buffer = js.native
  @JSImport("node:child_process", "execFileSync")
  @js.native
  def execFileSync(command: java.lang.String, options: ExecFileSyncOptionsWithBufferEncoding): Buffer = js.native
  @JSImport("node:child_process", "execFileSync")
  @js.native
  def execFileSync(command: java.lang.String, options: ExecFileSyncOptionsWithStringEncoding): java.lang.String = js.native
  @JSImport("node:child_process", "execFileSync")
  @js.native
  def execFileSync_String(command: java.lang.String): java.lang.String = js.native
  @JSImport("node:child_process", "execFileSync")
  @js.native
  def execFileSync_String(command: java.lang.String, args: js.Array[java.lang.String]): java.lang.String = js.native
  
  @JSImport("node:child_process", "execSync")
  @js.native
  def execSync(command: java.lang.String): Buffer = js.native
  @JSImport("node:child_process", "execSync")
  @js.native
  def execSync(command: java.lang.String, options: ExecSyncOptions): Buffer = js.native
  @JSImport("node:child_process", "execSync")
  @js.native
  def execSync(command: java.lang.String, options: ExecSyncOptionsWithBufferEncoding): Buffer = js.native
  @JSImport("node:child_process", "execSync")
  @js.native
  def execSync(command: java.lang.String, options: ExecSyncOptionsWithStringEncoding): java.lang.String = js.native
  @JSImport("node:child_process", "execSync")
  @js.native
  def execSync_String(command: java.lang.String): java.lang.String = js.native
  
  @JSImport("node:child_process", "fork")
  @js.native
  def fork(modulePath: java.lang.String): ChildProcess = js.native
  @JSImport("node:child_process", "fork")
  @js.native
  def fork(modulePath: java.lang.String, args: js.UndefOr[scala.Nothing], options: ForkOptions): ChildProcess = js.native
  @JSImport("node:child_process", "fork")
  @js.native
  def fork(modulePath: java.lang.String, args: js.Array[java.lang.String]): ChildProcess = js.native
  @JSImport("node:child_process", "fork")
  @js.native
  def fork(modulePath: java.lang.String, args: js.Array[java.lang.String], options: ForkOptions): ChildProcess = js.native
  @JSImport("node:child_process", "fork")
  @js.native
  def fork(modulePath: java.lang.String, options: ForkOptions): ChildProcess = js.native
  
  // overloads of spawn without 'args'
  // overloads of spawn with 'args'
  @JSImport("node:child_process", "spawn")
  @js.native
  def spawn(command: java.lang.String): ChildProcessWithoutNullStreams = js.native
  @JSImport("node:child_process", "spawn")
  @js.native
  def spawn(command: java.lang.String, args: js.UndefOr[scala.Nothing], options: SpawnOptionsWithoutStdio): ChildProcessWithoutNullStreams = js.native
  @JSImport("node:child_process", "spawn")
  @js.native
  def spawn(command: java.lang.String, args: js.Array[java.lang.String]): ChildProcessWithoutNullStreams = js.native
  @JSImport("node:child_process", "spawn")
  @js.native
  def spawn(command: java.lang.String, args: js.Array[java.lang.String], options: SpawnOptions): ChildProcess = js.native
  @JSImport("node:child_process", "spawn")
  @js.native
  def spawn(
    command: java.lang.String,
    args: js.Array[java.lang.String],
    options: SpawnOptionsWithStdioTuple[StdioNull | StdioPipe, StdioNull | StdioPipe, StdioNull | StdioPipe]
  ): ChildProcessByStdio[Writable, Readable, Readable] = js.native
  @JSImport("node:child_process", "spawn")
  @js.native
  def spawn(command: java.lang.String, args: js.Array[java.lang.String], options: SpawnOptionsWithoutStdio): ChildProcessWithoutNullStreams = js.native
  @JSImport("node:child_process", "spawn")
  @js.native
  def spawn(command: java.lang.String, options: SpawnOptions): ChildProcess = js.native
  @JSImport("node:child_process", "spawn")
  @js.native
  def spawn(
    command: java.lang.String,
    options: SpawnOptionsWithStdioTuple[StdioNull | StdioPipe, StdioNull | StdioPipe, StdioNull | StdioPipe]
  ): ChildProcessByStdio[Writable, Readable, Readable] = js.native
  @JSImport("node:child_process", "spawn")
  @js.native
  def spawn(command: java.lang.String, options: SpawnOptionsWithoutStdio): ChildProcessWithoutNullStreams = js.native
  
  @JSImport("node:child_process", "spawnSync")
  @js.native
  def spawnSync(command: java.lang.String): SpawnSyncReturns[Buffer] = js.native
  @JSImport("node:child_process", "spawnSync")
  @js.native
  def spawnSync(command: java.lang.String, args: js.UndefOr[scala.Nothing], options: SpawnSyncOptions): SpawnSyncReturns[Buffer] = js.native
  @JSImport("node:child_process", "spawnSync")
  @js.native
  def spawnSync(
    command: java.lang.String,
    args: js.UndefOr[scala.Nothing],
    options: SpawnSyncOptionsWithBufferEncoding
  ): SpawnSyncReturns[Buffer] = js.native
  @JSImport("node:child_process", "spawnSync")
  @js.native
  def spawnSync(
    command: java.lang.String,
    args: js.UndefOr[scala.Nothing],
    options: SpawnSyncOptionsWithStringEncoding
  ): SpawnSyncReturns[java.lang.String] = js.native
  @JSImport("node:child_process", "spawnSync")
  @js.native
  def spawnSync(command: java.lang.String, args: js.Array[java.lang.String]): SpawnSyncReturns[java.lang.String] = js.native
  @JSImport("node:child_process", "spawnSync")
  @js.native
  def spawnSync(command: java.lang.String, args: js.Array[java.lang.String], options: SpawnSyncOptions): SpawnSyncReturns[Buffer] = js.native
  @JSImport("node:child_process", "spawnSync")
  @js.native
  def spawnSync(
    command: java.lang.String,
    args: js.Array[java.lang.String],
    options: SpawnSyncOptionsWithBufferEncoding
  ): SpawnSyncReturns[Buffer] = js.native
  @JSImport("node:child_process", "spawnSync")
  @js.native
  def spawnSync(
    command: java.lang.String,
    args: js.Array[java.lang.String],
    options: SpawnSyncOptionsWithStringEncoding
  ): SpawnSyncReturns[java.lang.String] = js.native
  @JSImport("node:child_process", "spawnSync")
  @js.native
  def spawnSync(command: java.lang.String, options: SpawnSyncOptions): SpawnSyncReturns[Buffer] = js.native
  @JSImport("node:child_process", "spawnSync")
  @js.native
  def spawnSync(command: java.lang.String, options: SpawnSyncOptionsWithBufferEncoding): SpawnSyncReturns[Buffer] = js.native
  @JSImport("node:child_process", "spawnSync")
  @js.native
  def spawnSync(command: java.lang.String, options: SpawnSyncOptionsWithStringEncoding): SpawnSyncReturns[java.lang.String] = js.native
}
