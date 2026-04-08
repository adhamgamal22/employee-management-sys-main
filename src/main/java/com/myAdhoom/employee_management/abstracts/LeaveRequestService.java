package com.myAdhoom.employee_management.abstracts;

import com.myAdhoom.employee_management.dtos.LeaveRequestCreate;
import com.myAdhoom.employee_management.entities.LeaveRequest;

import java.util.List;
import java.util.UUID;

public interface LeaveRequestService {
  LeaveRequest createOne(LeaveRequestCreate leaveRequest, UUID employeeId);

  List<LeaveRequest> findAllByEmployeeId(UUID employeeId);
}
