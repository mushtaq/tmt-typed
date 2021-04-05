package tmttyped.node

import tmttyped.node.anon.encodingBufferEncodingExe
import tmttyped.node.anon.encodingbuffernullExecOpt
import tmttyped.node.childProcessMod.ChildProcess
import tmttyped.node.childProcessMod.ChildProcessByStdio
import tmttyped.node.childProcessMod.ChildProcessWithoutNullStreams
import tmttyped.node.childProcessMod.ExecException
import tmttyped.node.childProcessMod.ExecFileException
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
  
  @JSImport("node:child_process", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  // no `options` definitely means stdout/stderr are `string`.
  // NOTE: This namespace provides design-time support for util.promisify. Exported members do not exist at runtime.
  // fallback if nothing else matches. Worst case is always `string | Buffer`.
  @scala.inline
  def exec(command: java.lang.String): ChildProcess = ^.asInstanceOf[js.Dynamic].applyDynamic("exec")(command.asInstanceOf[js.Any]).asInstanceOf[ChildProcess]
  // NOTE: This namespace provides design-time support for util.promisify. Exported members do not exist at runtime.
  @scala.inline
  def exec(
    command: java.lang.String,
    callback: js.Function3[
      /* error */ ExecException | Null, 
      /* stdout */ java.lang.String, 
      /* stderr */ java.lang.String, 
      Unit
    ]
  ): ChildProcess = (^.asInstanceOf[js.Dynamic].applyDynamic("exec")(command.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[ChildProcess]
  // NOTE: This namespace provides design-time support for util.promisify. Exported members do not exist at runtime.
  @scala.inline
  def exec(command: java.lang.String, options: BaseEncodingOptions with ExecOptions): ChildProcess = (^.asInstanceOf[js.Dynamic].applyDynamic("exec")(command.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[ChildProcess]
  // NOTE: This namespace provides design-time support for util.promisify. Exported members do not exist at runtime.
  @scala.inline
  def exec(
    command: java.lang.String,
    options: BaseEncodingOptions with ExecOptions,
    callback: js.Function3[
      /* error */ ExecException | Null, 
      /* stdout */ java.lang.String | Buffer, 
      /* stderr */ java.lang.String | Buffer, 
      Unit
    ]
  ): ChildProcess = (^.asInstanceOf[js.Dynamic].applyDynamic("exec")(command.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[ChildProcess]
  // NOTE: This namespace provides design-time support for util.promisify. Exported members do not exist at runtime.
  @scala.inline
  def exec(
    command: java.lang.String,
    options: js.UndefOr[scala.Nothing],
    callback: js.Function3[
      /* error */ ExecException | Null, 
      /* stdout */ java.lang.String | Buffer, 
      /* stderr */ java.lang.String | Buffer, 
      Unit
    ]
  ): ChildProcess = (^.asInstanceOf[js.Dynamic].applyDynamic("exec")(command.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[ChildProcess]
  // NOTE: This namespace provides design-time support for util.promisify. Exported members do not exist at runtime.
  @scala.inline
  def exec(
    command: java.lang.String,
    options: Null,
    callback: js.Function3[
      /* error */ ExecException | Null, 
      /* stdout */ java.lang.String | Buffer, 
      /* stderr */ java.lang.String | Buffer, 
      Unit
    ]
  ): ChildProcess = (^.asInstanceOf[js.Dynamic].applyDynamic("exec")(command.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[ChildProcess]
  // `options` with well known `encoding` means stdout/stderr are definitely `string`.
  // NOTE: This namespace provides design-time support for util.promisify. Exported members do not exist at runtime.
  // `options` with an `encoding` whose type is `string` means stdout/stderr could either be `Buffer` or `string`.
  // There is no guarantee the `encoding` is unknown as `string` is a superset of `BufferEncoding`.
  @scala.inline
  def exec(command: java.lang.String, options: encodingBufferEncodingExe): ChildProcess = (^.asInstanceOf[js.Dynamic].applyDynamic("exec")(command.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[ChildProcess]
  // NOTE: This namespace provides design-time support for util.promisify. Exported members do not exist at runtime.
  @scala.inline
  def exec(
    command: java.lang.String,
    options: encodingBufferEncodingExe,
    callback: js.Function3[
      ExecException | Null, 
      Buffer | (/* stdout */ java.lang.String), 
      Buffer | (/* stderr */ java.lang.String), 
      Unit
    ]
  ): ChildProcess = (^.asInstanceOf[js.Dynamic].applyDynamic("exec")(command.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[ChildProcess]
  // `options` with `"buffer"` or `null` for `encoding` means stdout/stderr are definitely `Buffer`.
  // NOTE: This namespace provides design-time support for util.promisify. Exported members do not exist at runtime.
  @scala.inline
  def exec(command: java.lang.String, options: encodingbuffernullExecOpt): ChildProcess = (^.asInstanceOf[js.Dynamic].applyDynamic("exec")(command.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[ChildProcess]
  // NOTE: This namespace provides design-time support for util.promisify. Exported members do not exist at runtime.
  @scala.inline
  def exec(
    command: java.lang.String,
    options: encodingbuffernullExecOpt,
    callback: js.Function3[/* error */ ExecException | Null, /* stdout */ Buffer, /* stderr */ Buffer, Unit]
  ): ChildProcess = (^.asInstanceOf[js.Dynamic].applyDynamic("exec")(command.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[ChildProcess]
  // `options` without an `encoding` means stdout/stderr are definitely `string`.
  // NOTE: This namespace provides design-time support for util.promisify. Exported members do not exist at runtime.
  @scala.inline
  def exec(command: java.lang.String, options: ExecOptions): ChildProcess = (^.asInstanceOf[js.Dynamic].applyDynamic("exec")(command.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[ChildProcess]
  // NOTE: This namespace provides design-time support for util.promisify. Exported members do not exist at runtime.
  @scala.inline
  def exec(
    command: java.lang.String,
    options: ExecOptions,
    callback: js.Function3[
      /* error */ ExecException | Null, 
      /* stdout */ java.lang.String, 
      /* stderr */ java.lang.String, 
      Unit
    ]
  ): ChildProcess = (^.asInstanceOf[js.Dynamic].applyDynamic("exec")(command.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[ChildProcess]
  
  // NOTE: This namespace provides design-time support for util.promisify. Exported members do not exist at runtime.
  // fallback if nothing else matches. Worst case is always `string | Buffer`.
  @scala.inline
  def execFile(file: java.lang.String): ChildProcess = ^.asInstanceOf[js.Dynamic].applyDynamic("execFile")(file.asInstanceOf[js.Any]).asInstanceOf[ChildProcess]
  // NOTE: This namespace provides design-time support for util.promisify. Exported members do not exist at runtime.
  @scala.inline
  def execFile(
    file: java.lang.String,
    args: js.UndefOr[scala.Nothing],
    callback: js.Function3[
      ExecFileException | Null, 
      Buffer | (/* stdout */ java.lang.String), 
      Buffer | (/* stderr */ java.lang.String), 
      Unit
    ]
  ): ChildProcess = (^.asInstanceOf[js.Dynamic].applyDynamic("execFile")(file.asInstanceOf[js.Any], args.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[ChildProcess]
  // NOTE: This namespace provides design-time support for util.promisify. Exported members do not exist at runtime.
  @scala.inline
  def execFile(
    file: java.lang.String,
    args: js.UndefOr[scala.Nothing],
    options: BaseEncodingOptions with ExecFileOptions
  ): ChildProcess = (^.asInstanceOf[js.Dynamic].applyDynamic("execFile")(file.asInstanceOf[js.Any], args.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[ChildProcess]
  // NOTE: This namespace provides design-time support for util.promisify. Exported members do not exist at runtime.
  @scala.inline
  def execFile(
    file: java.lang.String,
    args: js.UndefOr[scala.Nothing],
    options: BaseEncodingOptions with ExecFileOptions,
    callback: js.Function3[
      /* error */ ExecFileException | Null, 
      /* stdout */ java.lang.String | Buffer, 
      /* stderr */ java.lang.String | Buffer, 
      Unit
    ]
  ): ChildProcess = (^.asInstanceOf[js.Dynamic].applyDynamic("execFile")(file.asInstanceOf[js.Any], args.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[ChildProcess]
  // NOTE: This namespace provides design-time support for util.promisify. Exported members do not exist at runtime.
  @scala.inline
  def execFile(
    file: java.lang.String,
    args: js.UndefOr[scala.Nothing],
    options: js.UndefOr[scala.Nothing],
    callback: js.Function3[
      /* error */ ExecFileException | Null, 
      /* stdout */ java.lang.String | Buffer, 
      /* stderr */ java.lang.String | Buffer, 
      Unit
    ]
  ): ChildProcess = (^.asInstanceOf[js.Dynamic].applyDynamic("execFile")(file.asInstanceOf[js.Any], args.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[ChildProcess]
  // NOTE: This namespace provides design-time support for util.promisify. Exported members do not exist at runtime.
  @scala.inline
  def execFile(
    file: java.lang.String,
    args: js.UndefOr[scala.Nothing],
    options: Null,
    callback: js.Function3[
      /* error */ ExecFileException | Null, 
      /* stdout */ java.lang.String | Buffer, 
      /* stderr */ java.lang.String | Buffer, 
      Unit
    ]
  ): ChildProcess = (^.asInstanceOf[js.Dynamic].applyDynamic("execFile")(file.asInstanceOf[js.Any], args.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[ChildProcess]
  // NOTE: This namespace provides design-time support for util.promisify. Exported members do not exist at runtime.
  @scala.inline
  def execFile(
    file: java.lang.String,
    args: js.UndefOr[scala.Nothing],
    options: ExecFileOptionsWithBufferEncoding,
    callback: js.Function3[/* error */ ExecFileException | Null, /* stdout */ Buffer, /* stderr */ Buffer, Unit]
  ): ChildProcess = (^.asInstanceOf[js.Dynamic].applyDynamic("execFile")(file.asInstanceOf[js.Any], args.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[ChildProcess]
  // NOTE: This namespace provides design-time support for util.promisify. Exported members do not exist at runtime.
  @scala.inline
  def execFile(
    file: java.lang.String,
    args: js.UndefOr[scala.Nothing],
    options: ExecFileOptionsWithOtherEncoding,
    callback: js.Function3[
      /* error */ ExecFileException | Null, 
      /* stdout */ java.lang.String | Buffer, 
      /* stderr */ java.lang.String | Buffer, 
      Unit
    ]
  ): ChildProcess = (^.asInstanceOf[js.Dynamic].applyDynamic("execFile")(file.asInstanceOf[js.Any], args.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[ChildProcess]
  // NOTE: This namespace provides design-time support for util.promisify. Exported members do not exist at runtime.
  @scala.inline
  def execFile(
    file: java.lang.String,
    args: js.UndefOr[scala.Nothing],
    options: ExecFileOptionsWithStringEncoding,
    callback: js.Function3[
      /* error */ ExecFileException | Null, 
      /* stdout */ java.lang.String, 
      /* stderr */ java.lang.String, 
      Unit
    ]
  ): ChildProcess = (^.asInstanceOf[js.Dynamic].applyDynamic("execFile")(file.asInstanceOf[js.Any], args.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[ChildProcess]
  // NOTE: This namespace provides design-time support for util.promisify. Exported members do not exist at runtime.
  @scala.inline
  def execFile(
    file: java.lang.String,
    args: js.UndefOr[scala.Nothing],
    options: ExecFileOptions,
    callback: js.Function3[
      /* error */ ExecFileException | Null, 
      /* stdout */ java.lang.String, 
      /* stderr */ java.lang.String, 
      Unit
    ]
  ): ChildProcess = (^.asInstanceOf[js.Dynamic].applyDynamic("execFile")(file.asInstanceOf[js.Any], args.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[ChildProcess]
  // NOTE: This namespace provides design-time support for util.promisify. Exported members do not exist at runtime.
  @scala.inline
  def execFile(file: java.lang.String, args: js.Array[java.lang.String]): ChildProcess = (^.asInstanceOf[js.Dynamic].applyDynamic("execFile")(file.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[ChildProcess]
  // NOTE: This namespace provides design-time support for util.promisify. Exported members do not exist at runtime.
  @scala.inline
  def execFile(
    file: java.lang.String,
    args: js.Array[java.lang.String],
    callback: js.Function3[
      /* error */ ExecFileException | Null, 
      /* stdout */ java.lang.String, 
      /* stderr */ java.lang.String, 
      Unit
    ]
  ): ChildProcess = (^.asInstanceOf[js.Dynamic].applyDynamic("execFile")(file.asInstanceOf[js.Any], args.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[ChildProcess]
  // NOTE: This namespace provides design-time support for util.promisify. Exported members do not exist at runtime.
  @scala.inline
  def execFile(
    file: java.lang.String,
    args: js.Array[java.lang.String],
    options: BaseEncodingOptions with ExecFileOptions
  ): ChildProcess = (^.asInstanceOf[js.Dynamic].applyDynamic("execFile")(file.asInstanceOf[js.Any], args.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[ChildProcess]
  // NOTE: This namespace provides design-time support for util.promisify. Exported members do not exist at runtime.
  @scala.inline
  def execFile(
    file: java.lang.String,
    args: js.Array[java.lang.String],
    options: BaseEncodingOptions with ExecFileOptions,
    callback: js.Function3[
      /* error */ ExecFileException | Null, 
      /* stdout */ java.lang.String | Buffer, 
      /* stderr */ java.lang.String | Buffer, 
      Unit
    ]
  ): ChildProcess = (^.asInstanceOf[js.Dynamic].applyDynamic("execFile")(file.asInstanceOf[js.Any], args.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[ChildProcess]
  // NOTE: This namespace provides design-time support for util.promisify. Exported members do not exist at runtime.
  @scala.inline
  def execFile(
    file: java.lang.String,
    args: js.Array[java.lang.String],
    options: js.UndefOr[scala.Nothing],
    callback: js.Function3[
      /* error */ ExecFileException | Null, 
      /* stdout */ java.lang.String | Buffer, 
      /* stderr */ java.lang.String | Buffer, 
      Unit
    ]
  ): ChildProcess = (^.asInstanceOf[js.Dynamic].applyDynamic("execFile")(file.asInstanceOf[js.Any], args.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[ChildProcess]
  // NOTE: This namespace provides design-time support for util.promisify. Exported members do not exist at runtime.
  @scala.inline
  def execFile(
    file: java.lang.String,
    args: js.Array[java.lang.String],
    options: Null,
    callback: js.Function3[
      /* error */ ExecFileException | Null, 
      /* stdout */ java.lang.String | Buffer, 
      /* stderr */ java.lang.String | Buffer, 
      Unit
    ]
  ): ChildProcess = (^.asInstanceOf[js.Dynamic].applyDynamic("execFile")(file.asInstanceOf[js.Any], args.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[ChildProcess]
  // NOTE: This namespace provides design-time support for util.promisify. Exported members do not exist at runtime.
  @scala.inline
  def execFile(
    file: java.lang.String,
    args: js.Array[java.lang.String],
    options: ExecFileOptionsWithBufferEncoding,
    callback: js.Function3[/* error */ ExecFileException | Null, /* stdout */ Buffer, /* stderr */ Buffer, Unit]
  ): ChildProcess = (^.asInstanceOf[js.Dynamic].applyDynamic("execFile")(file.asInstanceOf[js.Any], args.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[ChildProcess]
  // NOTE: This namespace provides design-time support for util.promisify. Exported members do not exist at runtime.
  @scala.inline
  def execFile(
    file: java.lang.String,
    args: js.Array[java.lang.String],
    options: ExecFileOptionsWithOtherEncoding,
    callback: js.Function3[
      /* error */ ExecFileException | Null, 
      /* stdout */ java.lang.String | Buffer, 
      /* stderr */ java.lang.String | Buffer, 
      Unit
    ]
  ): ChildProcess = (^.asInstanceOf[js.Dynamic].applyDynamic("execFile")(file.asInstanceOf[js.Any], args.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[ChildProcess]
  // NOTE: This namespace provides design-time support for util.promisify. Exported members do not exist at runtime.
  @scala.inline
  def execFile(
    file: java.lang.String,
    args: js.Array[java.lang.String],
    options: ExecFileOptionsWithStringEncoding,
    callback: js.Function3[
      /* error */ ExecFileException | Null, 
      /* stdout */ java.lang.String, 
      /* stderr */ java.lang.String, 
      Unit
    ]
  ): ChildProcess = (^.asInstanceOf[js.Dynamic].applyDynamic("execFile")(file.asInstanceOf[js.Any], args.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[ChildProcess]
  // NOTE: This namespace provides design-time support for util.promisify. Exported members do not exist at runtime.
  @scala.inline
  def execFile(
    file: java.lang.String,
    args: js.Array[java.lang.String],
    options: ExecFileOptions,
    callback: js.Function3[
      /* error */ ExecFileException | Null, 
      /* stdout */ java.lang.String, 
      /* stderr */ java.lang.String, 
      Unit
    ]
  ): ChildProcess = (^.asInstanceOf[js.Dynamic].applyDynamic("execFile")(file.asInstanceOf[js.Any], args.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[ChildProcess]
  // NOTE: This namespace provides design-time support for util.promisify. Exported members do not exist at runtime.
  @scala.inline
  def execFile(
    file: java.lang.String,
    args: Null,
    callback: js.Function3[
      ExecFileException | Null, 
      Buffer | (/* stdout */ java.lang.String), 
      Buffer | (/* stderr */ java.lang.String), 
      Unit
    ]
  ): ChildProcess = (^.asInstanceOf[js.Dynamic].applyDynamic("execFile")(file.asInstanceOf[js.Any], args.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[ChildProcess]
  // NOTE: This namespace provides design-time support for util.promisify. Exported members do not exist at runtime.
  @scala.inline
  def execFile(file: java.lang.String, args: Null, options: BaseEncodingOptions with ExecFileOptions): ChildProcess = (^.asInstanceOf[js.Dynamic].applyDynamic("execFile")(file.asInstanceOf[js.Any], args.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[ChildProcess]
  // NOTE: This namespace provides design-time support for util.promisify. Exported members do not exist at runtime.
  @scala.inline
  def execFile(
    file: java.lang.String,
    args: Null,
    options: BaseEncodingOptions with ExecFileOptions,
    callback: js.Function3[
      /* error */ ExecFileException | Null, 
      /* stdout */ java.lang.String | Buffer, 
      /* stderr */ java.lang.String | Buffer, 
      Unit
    ]
  ): ChildProcess = (^.asInstanceOf[js.Dynamic].applyDynamic("execFile")(file.asInstanceOf[js.Any], args.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[ChildProcess]
  // NOTE: This namespace provides design-time support for util.promisify. Exported members do not exist at runtime.
  @scala.inline
  def execFile(
    file: java.lang.String,
    args: Null,
    options: js.UndefOr[scala.Nothing],
    callback: js.Function3[
      /* error */ ExecFileException | Null, 
      /* stdout */ java.lang.String | Buffer, 
      /* stderr */ java.lang.String | Buffer, 
      Unit
    ]
  ): ChildProcess = (^.asInstanceOf[js.Dynamic].applyDynamic("execFile")(file.asInstanceOf[js.Any], args.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[ChildProcess]
  // NOTE: This namespace provides design-time support for util.promisify. Exported members do not exist at runtime.
  @scala.inline
  def execFile(
    file: java.lang.String,
    args: Null,
    options: Null,
    callback: js.Function3[
      /* error */ ExecFileException | Null, 
      /* stdout */ java.lang.String | Buffer, 
      /* stderr */ java.lang.String | Buffer, 
      Unit
    ]
  ): ChildProcess = (^.asInstanceOf[js.Dynamic].applyDynamic("execFile")(file.asInstanceOf[js.Any], args.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[ChildProcess]
  // NOTE: This namespace provides design-time support for util.promisify. Exported members do not exist at runtime.
  @scala.inline
  def execFile(
    file: java.lang.String,
    args: Null,
    options: ExecFileOptionsWithBufferEncoding,
    callback: js.Function3[/* error */ ExecFileException | Null, /* stdout */ Buffer, /* stderr */ Buffer, Unit]
  ): ChildProcess = (^.asInstanceOf[js.Dynamic].applyDynamic("execFile")(file.asInstanceOf[js.Any], args.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[ChildProcess]
  // NOTE: This namespace provides design-time support for util.promisify. Exported members do not exist at runtime.
  @scala.inline
  def execFile(
    file: java.lang.String,
    args: Null,
    options: ExecFileOptionsWithOtherEncoding,
    callback: js.Function3[
      /* error */ ExecFileException | Null, 
      /* stdout */ java.lang.String | Buffer, 
      /* stderr */ java.lang.String | Buffer, 
      Unit
    ]
  ): ChildProcess = (^.asInstanceOf[js.Dynamic].applyDynamic("execFile")(file.asInstanceOf[js.Any], args.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[ChildProcess]
  // NOTE: This namespace provides design-time support for util.promisify. Exported members do not exist at runtime.
  @scala.inline
  def execFile(
    file: java.lang.String,
    args: Null,
    options: ExecFileOptionsWithStringEncoding,
    callback: js.Function3[
      /* error */ ExecFileException | Null, 
      /* stdout */ java.lang.String, 
      /* stderr */ java.lang.String, 
      Unit
    ]
  ): ChildProcess = (^.asInstanceOf[js.Dynamic].applyDynamic("execFile")(file.asInstanceOf[js.Any], args.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[ChildProcess]
  // NOTE: This namespace provides design-time support for util.promisify. Exported members do not exist at runtime.
  @scala.inline
  def execFile(
    file: java.lang.String,
    args: Null,
    options: ExecFileOptions,
    callback: js.Function3[
      /* error */ ExecFileException | Null, 
      /* stdout */ java.lang.String, 
      /* stderr */ java.lang.String, 
      Unit
    ]
  ): ChildProcess = (^.asInstanceOf[js.Dynamic].applyDynamic("execFile")(file.asInstanceOf[js.Any], args.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[ChildProcess]
  // no `options` definitely means stdout/stderr are `string`.
  // NOTE: This namespace provides design-time support for util.promisify. Exported members do not exist at runtime.
  @scala.inline
  def execFile(
    file: java.lang.String,
    callback: js.Function3[
      /* error */ ExecFileException | Null, 
      /* stdout */ java.lang.String, 
      /* stderr */ java.lang.String, 
      Unit
    ]
  ): ChildProcess = (^.asInstanceOf[js.Dynamic].applyDynamic("execFile")(file.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[ChildProcess]
  // NOTE: This namespace provides design-time support for util.promisify. Exported members do not exist at runtime.
  @scala.inline
  def execFile(file: java.lang.String, options: BaseEncodingOptions with ExecFileOptions): ChildProcess = (^.asInstanceOf[js.Dynamic].applyDynamic("execFile")(file.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[ChildProcess]
  // NOTE: This namespace provides design-time support for util.promisify. Exported members do not exist at runtime.
  @scala.inline
  def execFile(
    file: java.lang.String,
    options: BaseEncodingOptions with ExecFileOptions,
    callback: js.Function3[
      /* error */ ExecFileException | Null, 
      /* stdout */ java.lang.String | Buffer, 
      /* stderr */ java.lang.String | Buffer, 
      Unit
    ]
  ): ChildProcess = (^.asInstanceOf[js.Dynamic].applyDynamic("execFile")(file.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[ChildProcess]
  // `options` with `"buffer"` or `null` for `encoding` means stdout/stderr are definitely `Buffer`.
  // NOTE: This namespace provides design-time support for util.promisify. Exported members do not exist at runtime.
  @scala.inline
  def execFile(
    file: java.lang.String,
    options: ExecFileOptionsWithBufferEncoding,
    callback: js.Function3[/* error */ ExecFileException | Null, /* stdout */ Buffer, /* stderr */ Buffer, Unit]
  ): ChildProcess = (^.asInstanceOf[js.Dynamic].applyDynamic("execFile")(file.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[ChildProcess]
  // `options` with an `encoding` whose type is `string` means stdout/stderr could either be `Buffer` or `string`.
  // There is no guarantee the `encoding` is unknown as `string` is a superset of `BufferEncoding`.
  // NOTE: This namespace provides design-time support for util.promisify. Exported members do not exist at runtime.
  @scala.inline
  def execFile(
    file: java.lang.String,
    options: ExecFileOptionsWithOtherEncoding,
    callback: js.Function3[
      /* error */ ExecFileException | Null, 
      /* stdout */ java.lang.String | Buffer, 
      /* stderr */ java.lang.String | Buffer, 
      Unit
    ]
  ): ChildProcess = (^.asInstanceOf[js.Dynamic].applyDynamic("execFile")(file.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[ChildProcess]
  // `options` with well known `encoding` means stdout/stderr are definitely `string`.
  // NOTE: This namespace provides design-time support for util.promisify. Exported members do not exist at runtime.
  @scala.inline
  def execFile(
    file: java.lang.String,
    options: ExecFileOptionsWithStringEncoding,
    callback: js.Function3[
      /* error */ ExecFileException | Null, 
      /* stdout */ java.lang.String, 
      /* stderr */ java.lang.String, 
      Unit
    ]
  ): ChildProcess = (^.asInstanceOf[js.Dynamic].applyDynamic("execFile")(file.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[ChildProcess]
  // `options` without an `encoding` means stdout/stderr are definitely `string`.
  // NOTE: This namespace provides design-time support for util.promisify. Exported members do not exist at runtime.
  @scala.inline
  def execFile(
    file: java.lang.String,
    options: ExecFileOptions,
    callback: js.Function3[
      /* error */ ExecFileException | Null, 
      /* stdout */ java.lang.String, 
      /* stderr */ java.lang.String, 
      Unit
    ]
  ): ChildProcess = (^.asInstanceOf[js.Dynamic].applyDynamic("execFile")(file.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[ChildProcess]
  
  @scala.inline
  def execFileSync(command: java.lang.String): Buffer = ^.asInstanceOf[js.Dynamic].applyDynamic("execFileSync")(command.asInstanceOf[js.Any]).asInstanceOf[Buffer]
  @scala.inline
  def execFileSync(command: java.lang.String, args: js.UndefOr[scala.Nothing], options: ExecFileSyncOptions): Buffer = (^.asInstanceOf[js.Dynamic].applyDynamic("execFileSync")(command.asInstanceOf[js.Any], args.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Buffer]
  @scala.inline
  def execFileSync(
    command: java.lang.String,
    args: js.UndefOr[scala.Nothing],
    options: ExecFileSyncOptionsWithBufferEncoding
  ): Buffer = (^.asInstanceOf[js.Dynamic].applyDynamic("execFileSync")(command.asInstanceOf[js.Any], args.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Buffer]
  @scala.inline
  def execFileSync(
    command: java.lang.String,
    args: js.UndefOr[scala.Nothing],
    options: ExecFileSyncOptionsWithStringEncoding
  ): java.lang.String = (^.asInstanceOf[js.Dynamic].applyDynamic("execFileSync")(command.asInstanceOf[js.Any], args.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
  @scala.inline
  def execFileSync(command: java.lang.String, args: js.Array[java.lang.String]): Buffer = (^.asInstanceOf[js.Dynamic].applyDynamic("execFileSync")(command.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[Buffer]
  @scala.inline
  def execFileSync(command: java.lang.String, args: js.Array[java.lang.String], options: ExecFileSyncOptions): Buffer = (^.asInstanceOf[js.Dynamic].applyDynamic("execFileSync")(command.asInstanceOf[js.Any], args.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Buffer]
  @scala.inline
  def execFileSync(
    command: java.lang.String,
    args: js.Array[java.lang.String],
    options: ExecFileSyncOptionsWithBufferEncoding
  ): Buffer = (^.asInstanceOf[js.Dynamic].applyDynamic("execFileSync")(command.asInstanceOf[js.Any], args.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Buffer]
  @scala.inline
  def execFileSync(
    command: java.lang.String,
    args: js.Array[java.lang.String],
    options: ExecFileSyncOptionsWithStringEncoding
  ): java.lang.String = (^.asInstanceOf[js.Dynamic].applyDynamic("execFileSync")(command.asInstanceOf[js.Any], args.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
  @scala.inline
  def execFileSync(command: java.lang.String, options: ExecFileSyncOptions): Buffer = (^.asInstanceOf[js.Dynamic].applyDynamic("execFileSync")(command.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Buffer]
  @scala.inline
  def execFileSync(command: java.lang.String, options: ExecFileSyncOptionsWithBufferEncoding): Buffer = (^.asInstanceOf[js.Dynamic].applyDynamic("execFileSync")(command.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Buffer]
  @scala.inline
  def execFileSync(command: java.lang.String, options: ExecFileSyncOptionsWithStringEncoding): java.lang.String = (^.asInstanceOf[js.Dynamic].applyDynamic("execFileSync")(command.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
  
  @scala.inline
  def execFileSync_String(command: java.lang.String): java.lang.String = ^.asInstanceOf[js.Dynamic].applyDynamic("execFileSync")(command.asInstanceOf[js.Any]).asInstanceOf[java.lang.String]
  @scala.inline
  def execFileSync_String(command: java.lang.String, args: js.Array[java.lang.String]): java.lang.String = (^.asInstanceOf[js.Dynamic].applyDynamic("execFileSync")(command.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
  
  @scala.inline
  def execSync(command: java.lang.String): Buffer = ^.asInstanceOf[js.Dynamic].applyDynamic("execSync")(command.asInstanceOf[js.Any]).asInstanceOf[Buffer]
  @scala.inline
  def execSync(command: java.lang.String, options: ExecSyncOptions): Buffer = (^.asInstanceOf[js.Dynamic].applyDynamic("execSync")(command.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Buffer]
  @scala.inline
  def execSync(command: java.lang.String, options: ExecSyncOptionsWithBufferEncoding): Buffer = (^.asInstanceOf[js.Dynamic].applyDynamic("execSync")(command.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Buffer]
  @scala.inline
  def execSync(command: java.lang.String, options: ExecSyncOptionsWithStringEncoding): java.lang.String = (^.asInstanceOf[js.Dynamic].applyDynamic("execSync")(command.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
  
  @scala.inline
  def execSync_String(command: java.lang.String): java.lang.String = ^.asInstanceOf[js.Dynamic].applyDynamic("execSync")(command.asInstanceOf[js.Any]).asInstanceOf[java.lang.String]
  
  @scala.inline
  def fork(modulePath: java.lang.String): ChildProcess = ^.asInstanceOf[js.Dynamic].applyDynamic("fork")(modulePath.asInstanceOf[js.Any]).asInstanceOf[ChildProcess]
  @scala.inline
  def fork(modulePath: java.lang.String, args: js.UndefOr[scala.Nothing], options: ForkOptions): ChildProcess = (^.asInstanceOf[js.Dynamic].applyDynamic("fork")(modulePath.asInstanceOf[js.Any], args.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[ChildProcess]
  @scala.inline
  def fork(modulePath: java.lang.String, args: js.Array[java.lang.String]): ChildProcess = (^.asInstanceOf[js.Dynamic].applyDynamic("fork")(modulePath.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[ChildProcess]
  @scala.inline
  def fork(modulePath: java.lang.String, args: js.Array[java.lang.String], options: ForkOptions): ChildProcess = (^.asInstanceOf[js.Dynamic].applyDynamic("fork")(modulePath.asInstanceOf[js.Any], args.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[ChildProcess]
  @scala.inline
  def fork(modulePath: java.lang.String, options: ForkOptions): ChildProcess = (^.asInstanceOf[js.Dynamic].applyDynamic("fork")(modulePath.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[ChildProcess]
  
  // overloads of spawn without 'args'
  // overloads of spawn with 'args'
  @scala.inline
  def spawn(command: java.lang.String): ChildProcessWithoutNullStreams = ^.asInstanceOf[js.Dynamic].applyDynamic("spawn")(command.asInstanceOf[js.Any]).asInstanceOf[ChildProcessWithoutNullStreams]
  @scala.inline
  def spawn(command: java.lang.String, args: js.UndefOr[scala.Nothing], options: SpawnOptionsWithoutStdio): ChildProcessWithoutNullStreams = (^.asInstanceOf[js.Dynamic].applyDynamic("spawn")(command.asInstanceOf[js.Any], args.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[ChildProcessWithoutNullStreams]
  @scala.inline
  def spawn(command: java.lang.String, args: js.Array[java.lang.String]): ChildProcessWithoutNullStreams = (^.asInstanceOf[js.Dynamic].applyDynamic("spawn")(command.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[ChildProcessWithoutNullStreams]
  @scala.inline
  def spawn(command: java.lang.String, args: js.Array[java.lang.String], options: SpawnOptions): ChildProcess = (^.asInstanceOf[js.Dynamic].applyDynamic("spawn")(command.asInstanceOf[js.Any], args.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[ChildProcess]
  @scala.inline
  def spawn(
    command: java.lang.String,
    args: js.Array[java.lang.String],
    options: SpawnOptionsWithStdioTuple[StdioNull | StdioPipe, StdioNull | StdioPipe, StdioNull | StdioPipe]
  ): ChildProcessByStdio[Writable, Readable, Readable] = (^.asInstanceOf[js.Dynamic].applyDynamic("spawn")(command.asInstanceOf[js.Any], args.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[ChildProcessByStdio[Writable, Readable, Readable]]
  @scala.inline
  def spawn(command: java.lang.String, args: js.Array[java.lang.String], options: SpawnOptionsWithoutStdio): ChildProcessWithoutNullStreams = (^.asInstanceOf[js.Dynamic].applyDynamic("spawn")(command.asInstanceOf[js.Any], args.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[ChildProcessWithoutNullStreams]
  @scala.inline
  def spawn(command: java.lang.String, options: SpawnOptions): ChildProcess = (^.asInstanceOf[js.Dynamic].applyDynamic("spawn")(command.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[ChildProcess]
  @scala.inline
  def spawn(
    command: java.lang.String,
    options: SpawnOptionsWithStdioTuple[StdioNull | StdioPipe, StdioNull | StdioPipe, StdioNull | StdioPipe]
  ): ChildProcessByStdio[Writable, Readable, Readable] = (^.asInstanceOf[js.Dynamic].applyDynamic("spawn")(command.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[ChildProcessByStdio[Writable, Readable, Readable]]
  @scala.inline
  def spawn(command: java.lang.String, options: SpawnOptionsWithoutStdio): ChildProcessWithoutNullStreams = (^.asInstanceOf[js.Dynamic].applyDynamic("spawn")(command.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[ChildProcessWithoutNullStreams]
  
  @scala.inline
  def spawnSync(command: java.lang.String): SpawnSyncReturns[Buffer] = ^.asInstanceOf[js.Dynamic].applyDynamic("spawnSync")(command.asInstanceOf[js.Any]).asInstanceOf[SpawnSyncReturns[Buffer]]
  @scala.inline
  def spawnSync(command: java.lang.String, args: js.UndefOr[scala.Nothing], options: SpawnSyncOptions): SpawnSyncReturns[Buffer] = (^.asInstanceOf[js.Dynamic].applyDynamic("spawnSync")(command.asInstanceOf[js.Any], args.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[SpawnSyncReturns[Buffer]]
  @scala.inline
  def spawnSync(
    command: java.lang.String,
    args: js.UndefOr[scala.Nothing],
    options: SpawnSyncOptionsWithBufferEncoding
  ): SpawnSyncReturns[Buffer] = (^.asInstanceOf[js.Dynamic].applyDynamic("spawnSync")(command.asInstanceOf[js.Any], args.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[SpawnSyncReturns[Buffer]]
  @scala.inline
  def spawnSync(
    command: java.lang.String,
    args: js.UndefOr[scala.Nothing],
    options: SpawnSyncOptionsWithStringEncoding
  ): SpawnSyncReturns[java.lang.String] = (^.asInstanceOf[js.Dynamic].applyDynamic("spawnSync")(command.asInstanceOf[js.Any], args.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[SpawnSyncReturns[java.lang.String]]
  @scala.inline
  def spawnSync(command: java.lang.String, args: js.Array[java.lang.String]): SpawnSyncReturns[java.lang.String] = (^.asInstanceOf[js.Dynamic].applyDynamic("spawnSync")(command.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[SpawnSyncReturns[java.lang.String]]
  @scala.inline
  def spawnSync(command: java.lang.String, args: js.Array[java.lang.String], options: SpawnSyncOptions): SpawnSyncReturns[Buffer] = (^.asInstanceOf[js.Dynamic].applyDynamic("spawnSync")(command.asInstanceOf[js.Any], args.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[SpawnSyncReturns[Buffer]]
  @scala.inline
  def spawnSync(
    command: java.lang.String,
    args: js.Array[java.lang.String],
    options: SpawnSyncOptionsWithBufferEncoding
  ): SpawnSyncReturns[Buffer] = (^.asInstanceOf[js.Dynamic].applyDynamic("spawnSync")(command.asInstanceOf[js.Any], args.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[SpawnSyncReturns[Buffer]]
  @scala.inline
  def spawnSync(
    command: java.lang.String,
    args: js.Array[java.lang.String],
    options: SpawnSyncOptionsWithStringEncoding
  ): SpawnSyncReturns[java.lang.String] = (^.asInstanceOf[js.Dynamic].applyDynamic("spawnSync")(command.asInstanceOf[js.Any], args.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[SpawnSyncReturns[java.lang.String]]
  @scala.inline
  def spawnSync(command: java.lang.String, options: SpawnSyncOptions): SpawnSyncReturns[Buffer] = (^.asInstanceOf[js.Dynamic].applyDynamic("spawnSync")(command.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[SpawnSyncReturns[Buffer]]
  @scala.inline
  def spawnSync(command: java.lang.String, options: SpawnSyncOptionsWithBufferEncoding): SpawnSyncReturns[Buffer] = (^.asInstanceOf[js.Dynamic].applyDynamic("spawnSync")(command.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[SpawnSyncReturns[Buffer]]
  @scala.inline
  def spawnSync(command: java.lang.String, options: SpawnSyncOptionsWithStringEncoding): SpawnSyncReturns[java.lang.String] = (^.asInstanceOf[js.Dynamic].applyDynamic("spawnSync")(command.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[SpawnSyncReturns[java.lang.String]]
}
