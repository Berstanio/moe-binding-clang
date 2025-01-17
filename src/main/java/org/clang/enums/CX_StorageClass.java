/*
Copyright 2014-2016 Intel Corporation

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

    http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
*/

package org.clang.enums;

import org.moe.natj.general.ann.Generated;

/**
 * Represents the storage classes as declared in the source. CX_SC_Invalid
 * was added for the case that the passed cursor in not a declaration.
 */
@Generated
public final class CX_StorageClass {
    @Generated public static final int Invalid = 0x00000000;
    @Generated public static final int None = 0x00000001;
    @Generated public static final int Extern = 0x00000002;
    @Generated public static final int Static = 0x00000003;
    @Generated public static final int PrivateExtern = 0x00000004;
    @Generated public static final int OpenCLWorkGroupLocal = 0x00000005;
    @Generated public static final int Auto = 0x00000006;
    @Generated public static final int Register = 0x00000007;

    @Generated
    private CX_StorageClass() {
    }
}
