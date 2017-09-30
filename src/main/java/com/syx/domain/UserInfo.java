package com.syx.domain;

import lombok.*;

/**
 * Created by Panda on 2016/10/28.
 */
@Setter
@Getter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class UserInfo {
    private long id;
    private String username;
    private int version;//版本控制

}
