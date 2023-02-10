package com.hz.resource;

import com.hz.dto.StudentDTO;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.QueryParam;

@Path("/students")
public class StudentResource {

    @GET
    @Path("/getStudentById/{student_id}")
    @Operation(summary = "根据id查询学生信息",
    tags = {"students"})
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200",content = @Content(mediaType = "application/json",schema = @Schema(implementation = StudentDTO.class)),description = "查询成功"),
            @ApiResponse(responseCode = "404",description = "学生不存在")


    })
    public StudentDTO getStudentById(@PathParam("student_id") Long studentId){
        return new StudentDTO();
    }

    @GET
    @Path("/listStudents")
    @Operation(summary = "查询学生列表",
            tags = {"students"})
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200",content = @Content(mediaType = "application/json",schema = @Schema(implementation = StudentDTO.class)),description = "查询成功"),
    })

    public StudentDTO listStudents(@QueryParam("pageNo") Integer pageNo,
                                   @QueryParam("pageSize")Integer pageSize,
                                   @QueryParam("name") String name){
        return new StudentDTO();
    }

}
