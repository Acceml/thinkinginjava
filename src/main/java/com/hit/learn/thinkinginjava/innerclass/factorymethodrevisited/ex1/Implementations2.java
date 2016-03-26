/*
 * Copyright (c) 2016. The Acceml.
 *
 *   Licensed under the Apache License, Version 2.0 (the "License");
 *   you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 *   Unless required by applicable law or agreed to in writing, software
 *   distributed under the License is distributed on an "AS IS" BASIS,
 *   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *   See the License for the specific language governing permissions and
 *   limitations under the License.
 */

package com.hit.learn.thinkinginjava.innerclass.factorymethodrevisited.ex1;

/**
 * Created by Acceml on 2016/3/26.
 * Email: huminghit@gmail.com
 */
class Implementations2 implements Service{
    public Implementations2() {
    }

    @Override
    public void method1() {
        System.out.println("Implementations2 1");
    }

    @Override
    public void method2() {
        System.out.println("Implementations2 2");
    }

    public static ServiceFactory factory= new ServiceFactory() {
        @Override
        public Service getService() {
            return new Implementations2();
        }
    };
}
