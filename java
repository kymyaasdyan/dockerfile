document.getElementById('add-task').addEventListener('click', function() {
  const taskInput = document.getElementById('task-input');
  const taskText = taskInput.value;

  if (taskText) {
      const li = document.createElement('li');
      li.textContent = taskText;

      const deleteButton = document.createElement('button');
      deleteButton.textContent = "delet";
      deleteButton.addEventListener('click', function() {
          li.remove();
      });

      li.appendChild(deleteButton);
      document.getElementById('task-list').appendChild(li);
      taskInput.value = '';
  }
});
